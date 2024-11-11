package net.plateau.common.util.writeInfo;

import net.plateau.common.util.readInfo.readConfigFileInfo;

import java.io.File;
import java.io.IOException;

//创建写入配置文件类(继承Thread)
public class createConfigFile {
    public static void create() throws IOException {
        String programPath = System.getProperty("user.dir");
        File file = new File(programPath + "\\ptcl.json");
        // 读取配置文件(如果找不到配置文件，则创建)
        if (!file.exists()) {
            // 创建配置文件json
            boolean success = file.createNewFile();
            if (success) {
                System.out.println("Create config file success");
                writeConfigFileInfo.write();
            }
            else if (!success) {
                System.err.println("ERROR:can't create config file");
            }
        }
        else {
            readConfigFileInfo.read();
        }
    }
}
