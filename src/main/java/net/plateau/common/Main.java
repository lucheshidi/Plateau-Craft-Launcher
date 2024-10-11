package net.plateau.common;

import java.io.File;
import java.util.Scanner;

/**
 * @author shidi
 *
 * @see "github.com/lucheshidi/Plateau-Craft-Launcher-Command"
 *
 * @apiNote
 * This is the Plateau Launcher Command version.
 * The GUI version is stop exploitation.
 * <p>
 * (c)Copyright Plateau
 * 2024.10.11
 */

//创建写入配置文件类(继承Thread)
class writeFileInfo extends Thread
{
    @Override
    public void run()
    {
        String programPath = System.getProperty("user.dir");
        File file = new File(programPath + "");
        System.out.println(programPath);
        if (!file.exists()) {
            file.mkdir();
        }
    }
}

public class Main
{
    public static void main()
    {
        String projectPath = System.getProperty("user.dir");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Plateau Launcher");
        System.out.println("copyright(c) net.plateau");
        String consolefolder = "C:\\";
        String runMCCommand = "";
        String minecraftFolder;

        while (true)
        {
            System.out.print("PTCL " + consolefolder + ":#>>");
            String input = scanner.nextLine();

            if ("".equalsIgnoreCase(input))
            {
                /*
                 * 要不然
                 */
            }
            else if ("exit".equalsIgnoreCase(input))
            {
                System.out.println("PTCL is exit");
                System.exit(0);
                break;
            }
            else if ("run".equalsIgnoreCase(input))
            {
                System.out.println("Please input launch version:");
                String ver = scanner.nextLine();
                System.out.println("\"run\" is testing!");
            }
            else if ("cd".equalsIgnoreCase(input))
            {
                System.out.println("Please choose \".minecraft\" folder directory:");
                minecraftFolder = scanner.nextLine();
                consolefolder = minecraftFolder;
                System.out.println("Set \".minecraft\" folder success!");
            }
            else
            {
                // 处理用户输入的命令，你可以根据不同的命令执行相应的操作
                System.out.println("error:unknown command:" + input);
            }
        }
    }
}