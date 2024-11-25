package net.plateau.common.util.writeInfo;

import com.google.gson.GsonBuilder;
import net.plateau.common.util.readInfo.json.Config;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class SetConfigFileValue {
    public static void change(String options, String value) {
        //
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String filePath = "./ptcl.json";
        try (FileReader reader = new FileReader(filePath)) {

            // 将 JSON 文件内容解析为 Config 对象
            Config config = gson.fromJson(reader, Config.class);

            switch (options) {
                case "gameDir", "GameDir" -> config.getDirs().setGameDir(value);
                case "JavaDir", "javaDir" -> config.getDirs().setJavaDir(value);
                case "versionIsolation", "VersionIsolation" -> config.getDirs().setIsOpenVersionIsolation(value);
                case null, default -> {}
            }

            FileWriter writer = new FileWriter(filePath);
            gson.toJson(config, writer);
            writer.close();


        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
