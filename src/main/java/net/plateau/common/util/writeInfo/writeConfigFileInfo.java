package net.plateau.common.util.writeInfo;

import java.io.*;

public class writeConfigFileInfo {
    public static void write() throws IOException {
        String programPath = System.getProperty("user.dir");
        File file = new File(programPath + "\\ptcl.json");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();


            if (line == null) {
                try {

                    String writeData = """
                    {
                        "dirs": {
                            "DEFAULT-JAVA-DIR": "JAVA_HOME",
                            "gameDir": "NULL",
                            "JavaDir": "DEFAULT"
                        },
                        "isOpenVersionIsolation": "false",
                        "isEggHuntFound" :"false",
                        "javaMemory": {
                            "DEFAULT": "4g",
                            "Xmx": "DEFAULT",
                            "Xms": "DEFAULT"
                        }
                    }
                    """;

                    //true = append file
                    if (file.exists()) {
                        FileWriter fileWriter= new FileWriter(file.getName(),true);
                        fileWriter.write(writeData);
                        fileWriter.close();
                    }
                    else if(!file.exists()) {
                        createConfigFile.create();
                    }
                }
                catch(IOException error) {
                    error.printStackTrace();
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
