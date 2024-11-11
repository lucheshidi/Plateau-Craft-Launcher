package net.plateau.common.gson;

import com.google.gson.Gson;

import net.plateau.common.gson.jsons.Config;
import net.plateau.common.gson.jsons.Dirs;
import net.plateau.common.gson.jsons.JavaMemory;

public class Test {
    public static void main(String[] args) {
        String json = "{\n" +
                "    \"dirs\": {\n" +
                "        \"gameDir\": \"\",\n" +
                "        \"isOpenVersionIsolation\": \"false\",\n" +
                "        \"JavaDir\": \"\"\n" +
                "    },\n" +
                "    \"isEggHuntFound\" :\"false\",\n" +
                "    \"javaMemory\": {\n" +
                "        \"DEFAULT\": \"4g\",\n" +
                "        \"Xmx\": \"DEFAULT\",\n" +
                "        \"Xms\": \"DEFAULT\"\n" +
                "    }\n" +
                "}";

        Gson gson = new Gson();
        Config config = gson.fromJson(json, Config.class);

        // 访问解析后的数据
        System.out.println("Game Directory: " + config.getDirs().getGameDir());
        System.out.println("Is Version Isolation Open: " + config.getDirs().getIsOpenVersionIsolation());
        System.out.println("Java Directory: " + config.getDirs().getJavaDir());
        System.out.println("Is Egg Hunt Found: " + config.getIsEggHuntFound());
        System.out.println("Java Memory Default: " + config.getJavaMemory().getDEFAULT());
        System.out.println("Java Memory Xmx: " + config.getJavaMemory().getXmx());
        System.out.println("Java Memory Xms: " + config.getJavaMemory().getXms());
    }
}
