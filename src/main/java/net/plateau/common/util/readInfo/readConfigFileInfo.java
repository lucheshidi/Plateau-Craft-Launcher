package net.plateau.common.util.readInfo;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

import net.plateau.common.util.readInfo.json.Config;

public class readConfigFileInfo {
    public static void read() {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("ptcl.json")) {
            // 将 JSON 文件内容解析为 Config 对象
            Config config = gson.fromJson(reader, Config.class);

            // 使用 getter 方法访问各个字段

            /*
            System.out.println("Game Directory: " + config.getDirs().getGameDir());
            System.out.println("Is Version Isolation Open: " + config.getDirs().getIsOpenVersionIsolation());
            System.out.println("Java Directory: " + config.getDirs().getJavaDir());
            System.out.println("Is Egg Hunt Found: " + config.getIsEggHuntFound());
            System.out.println("Java Memory Default: " + config.getJavaMemory().getDEFAULT());
            System.out.println("Java Memory Xmx: " + config.getJavaMemory().getXmx());
            System.out.println("Java Memory Xms: " + config.getJavaMemory().getXms());
             */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
