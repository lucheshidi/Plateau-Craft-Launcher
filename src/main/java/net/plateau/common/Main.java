package net.plateau.common;

import java.io.File;
import java.util.Scanner;

/**
 * @author shidi
 *
 *
 * @apiNote
 * This is the Plateau Launcher Command version.
 * The GUI version is stop exploitation.
 * <p>
 * (c)Copyright Plateau
 * 2024.10.11
 *
 * @version 0.1.5
 */

//创建写入配置文件类(继承Thread)
class writeFileInfo extends Thread
{
    @Override
    public void run()
    {
        String programPath = System.getProperty("user.dir");
        File file = new File(programPath + "/plateau/info.json");
        System.out.println(programPath);
        file.mkdir();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        String programPath = System.getProperty("user.dir");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Plateau Launcher");
        System.out.println("(c)Copyright net.plateau");
        String consolefolder = "C:\\";
        String runMCCommand = "";
        String minecraftFolder;

        while (true)
        {
            System.out.print("<PTCL> [" + consolefolder + "]:>># ");
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
            else if ("cd".equalsIgnoreCase(input))
            {
                System.out.print("Please input \".minecraft\" folder directory:");
                minecraftFolder = scanner.nextLine();
                if (minecraftFolder == "")
                {
                    System.out.println("ERROR:unknown directory \"\"");
                    return;
                }
                consolefolder = minecraftFolder;
                System.out.println("Set \".minecraft\" folder success!");
            }
            else if ("cd ".equalsIgnoreCase(input))
            {
                System.out.print("Please input \".minecraft\" folder directory:");
                minecraftFolder = scanner.nextLine();
                if (minecraftFolder == "")
                {
                    System.out.println("ERROR:unknown directory \"\"");
                    return;
                }
                consolefolder = minecraftFolder;
                System.out.println("Set \".minecraft\" folder success!");
            }
            else if ("run".equalsIgnoreCase(input))
            {
                System.out.print("Please input launch version: ");
                String ver = scanner.nextLine();
                System.out.print("Is this version have Mod Loader?[Y/n]: ");
                String modLoader = scanner.nextLine();
                switch (modLoader) {
                    case "Y", "y" -> System.out.println("\"modLoader\" is testing!");
                    case "N", "n" -> System.out.println("\"modLoader\" is testing!");
                    case null, default -> System.out.println("ERROR:unknown option:" + modLoader);
                }
                System.out.println("\"run\" is testing!");
            }
            else if ("run ".equalsIgnoreCase(input))
            {
                System.out.print("Please input launch version: ");
                String ver = scanner.nextLine();
                System.out.print("Is this version have Mod Loader?[Y/n]: ");
                String modLoader = scanner.nextLine();
                switch (modLoader) {
                    case "Y", "y" -> System.out.println("\"modLoader\" is testing!");
                    case "N", "n" -> System.out.print("\"modLoader\" is testing!");
                    case null, default -> System.out.print("ERROR:unknown option:" + modLoader);
                }
                System.out.println("\"run\" is testing!");
            }
            else
            {
                // 处理用户输入的命令，你可以根据不同的命令执行相应的操作
                System.out.println("error:unknown command:" + input);
            }
        }
    }
}