package net.plateau.common.util;

import java.io.File;

//创建写入配置文件类(继承Thread)
public class writeFileInfo extends Thread
{
    public static void writeInfo()
    {
        String programPath = System.getProperty("user.dir");
        File file = new File(programPath + "/plateau/info.json");
        boolean success = file.mkdir();
    }
}
