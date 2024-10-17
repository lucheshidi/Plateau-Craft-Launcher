package net.plateau.common.util;

import java.util.Scanner;

public class createCommands
{
    public static void Create()
    {
        String programPath = System.getProperty("user.dir");
        String consolefolder = "C:\\";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("<PTCL> [" + consolefolder + "]:>># ");
            String input = scanner.nextLine();

            if ("".equalsIgnoreCase(input)) {
                /*
                 * 要不然
                 */
            } else if ("exit".equalsIgnoreCase(input)) {
                System.out.println("PTCL is exit");
                System.exit(0);
                break;
            } else if ("cd".equalsIgnoreCase(input)) {
                System.out.print("Please input \".minecraft\" folder directory: ");
                consolefolder = scanner.nextLine();
                if (consolefolder == "") {
                    System.out.println("ERROR:unknown directory \"\"");
                    return;
                }
                System.out.println("Set \".minecraft\" folder success!");
            } else if ("cd ".equalsIgnoreCase(input)) {
                System.out.print("Please input \".minecraft\" folder directory: ");
                consolefolder = scanner.nextLine();
                if (consolefolder == "") {
                    System.out.println("ERROR:unknown directory \"\"");
                    return;
                }
                System.out.println("Set \".minecraft\" folder success!");
            } else if ("run".equalsIgnoreCase(input)) {
                System.out.print("Please input launch version: ");
                String ver = scanner.nextLine();
                System.out.print("Is this version have Mod Loader?[Y/n]: ");
                String modLoader = scanner.nextLine();
                switch (modLoader) {
                    case "Y", "y" -> System.out.println("\"modLoader\" is testing!");
                    case "N", "n" -> System.out.println("\"modLoader\" is testing!");
                    case null, default -> System.out.println("ERROR:Unknown Option:" + modLoader);
                }
                System.out.println("\"run\" is testing!");
            } else if ("run ".equalsIgnoreCase(input)) {
                System.out.print("Please input launch version: ");
                String ver = scanner.nextLine();
                System.out.print("Is this version have Mod Loader?[Y/n]: ");
                String modLoader = scanner.nextLine();
                switch (modLoader) {
                    case "Y", "y" -> System.out.println("\"modLoader\" is testing!");
                    case "N", "n" -> System.out.print("\"modLoader\" is testing!");
                    case null, default -> System.out.print("ERROR:Unknown Option:" + modLoader);
                }
                System.out.println("\"run\" is testing!");
            } else {
                // 处理用户输入的命令，你可以根据不同的命令执行相应的操作
                System.out.println("ERROR:Unknown Command:" + input);
            }
        }
    }
}
