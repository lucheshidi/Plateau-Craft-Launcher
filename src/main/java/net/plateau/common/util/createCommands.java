package net.plateau.common.util;

import java.util.Scanner;
import net.plateau.common.util.commands.runMCCommands;

public class createCommands
{
    public static void Create()
    {
        String programPath = System.getProperty("user.dir");
        String consolefolder = "C:\\";

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("<PTCL> [" + consolefolder + "]:>># ");
            String input = scanner.nextLine();

            if ("".equalsIgnoreCase(input)) {
                /*
                 * 要不然没输入啥直接空格也报错
                 * 就是让他啥也别做
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
                System.out.print("Please input \".minecraft\" folder directory: ");
                consolefolder = scanner.nextLine();
                if (consolefolder == "") {
                    System.out.println("ERROR:unknown directory \"\"");
                    return;
                }
                System.out.println("Set \".minecraft\" folder success!");
            }
            else if ("cd ".equalsIgnoreCase(input))
            {
                System.out.print("Please input \".minecraft\" folder directory: ");
                consolefolder = scanner.nextLine();
                if (consolefolder == "") {
                    System.out.println("ERROR:unknown directory \"\"");
                    return;
                }
                System.out.println("Set \".minecraft\" folder success!");
            }
            else if ("run".equalsIgnoreCase(input))
            {
                System.out.print("Please input launch version: ");
                String ver = scanner.nextLine();
                System.out.print("Is this version have Mod Loader?[Y/n]: ");
                String modLoader = scanner.nextLine();
                switch (modLoader)
                {
                    case "N", "n" -> runMCCommands.run("\"D:\\\\Program Files\\\\Zulu\\\\zulu-8-jre\\\\bin\\\\java.exe\" -Xmx9101m -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=GB18030 -Dsun.stderr.encoding=GB18030 -Djava.rmi.server.useCodebaseOnly=true -Dcom.sun.jndi.rmi.object.trustURLCodebase=false -Dcom.sun.jndi.cosnaming.object.trustURLCodebase=false -Dlog4j2.formatMsgNoLookups=true -Dlog4j.configurationFile=F:\\Games\\Minecraft\\.minecraft\\versions\\PVP+Vape\\log4j2.xml -Dminecraft.client.jar=F:\\Games\\Minecraft\\.minecraft\\versions\\PVP+Vape\\PVP+Vape.jar -XX:+UnlockExperimentalVMOptions -XX:+UseG1GC -XX:G1NewSizePercent=20 -XX:G1ReservePercent=20 -XX:MaxGCPauseMillis=50 -XX:G1HeapRegionSize=32m -XX:-UseAdaptiveSizePolicy -XX:-OmitStackTraceInFastThrow -XX:-DontCompileHugeMethods -Dfml.ignoreInvalidMinecraftCertificates=true -Dfml.ignorePatchDiscrepancies=true -XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump -Djava.library.path=F:\\Games\\Minecraft\\.minecraft\\versions\\PVP+Vape\\natives-windows-x86_64 -Dminecraft.launcher.brand=HMCL -Dminecraft.launcher.version=3.5.9 -cp F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\mojang\\netty\\1.8.8\\netty-1.8.8.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\oshi-project\\oshi-core\\1.1\\oshi-core-1.1.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\net\\java\\dev\\jna\\jna\\3.4.0\\jna-3.4.0.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\net\\java\\dev\\jna\\platform\\3.4.0\\platform-3.4.0.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\ibm\\icu\\icu4j-core-mojang\\51.2\\icu4j-core-mojang-51.2.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\net\\sf\\jopt-simple\\jopt-simple\\4.6\\jopt-simple-4.6.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\paulscode\\codecjorbis\\20101023\\codecjorbis-20101023.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\paulscode\\codecwav\\20101023\\codecwav-20101023.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\paulscode\\libraryjavasound\\20101123\\libraryjavasound-20101123.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\paulscode\\librarylwjglopenal\\20100824\\librarylwjglopenal-20100824.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\paulscode\\soundsystem\\20120107\\soundsystem-20120107.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\io\\netty\\netty-all\\4.0.23.Final\\netty-all-4.0.23.Final.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\google\\guava\\guava\\17.0\\guava-17.0.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\commons\\commons-lang3\\3.3.2\\commons-lang3-3.3.2.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\commons-io\\commons-io\\2.4\\commons-io-2.4.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\commons-codec\\commons-codec\\1.9\\commons-codec-1.9.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\net\\java\\jinput\\jinput\\2.0.5\\jinput-2.0.5.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\net\\java\\jutils\\jutils\\1.0.0\\jutils-1.0.0.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\google\\code\\gson\\gson\\2.2.4\\gson-2.2.4.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\mojang\\authlib\\1.5.21\\authlib-1.5.21.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\mojang\\realms\\1.7.59\\realms-1.7.59.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\commons\\commons-compress\\1.8.1\\commons-compress-1.8.1.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\httpcomponents\\httpclient\\4.3.3\\httpclient-4.3.3.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\commons-logging\\commons-logging\\1.1.3\\commons-logging-1.1.3.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\httpcomponents\\httpcore\\4.3.2\\httpcore-4.3.2.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\logging\\log4j\\log4j-api\\2.0-beta9\\log4j-api-2.0-beta9.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\logging\\log4j\\log4j-core\\2.0-beta9\\log4j-core-2.0-beta9.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\lwjgl\\lwjgl\\lwjgl\\2.9.4-nightly-20150209\\lwjgl-2.9.4-nightly-20150209.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\lwjgl\\lwjgl\\lwjgl_util\\2.9.4-nightly-20150209\\lwjgl_util-2.9.4-nightly-20150209.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\tv\\twitch\\twitch\\6.5\\twitch-6.5.jar;F:\\Games\\Minecraft\\.minecraft\\versions\\PVP+Vape\\PVP+Vape.jar net.minecraft.client.main.Main --username shidi2023 --version PVP+Vape --gameDir F:\\Games\\Minecraft\\.minecraft --assetsDir F:\\Games\\Minecraft\\.minecraft\\assets --assetIndex 1.8 --uuid f45daac5d22f4d19861cdc78cbfe0ceb --accessToken eyJraWQiOiJhYzg0YSIsImFsZyI6IkhTMjU2In0.eyJ4dWlkIjoiMjUzNTQ0Mzg2MDUzMzUxMCIsImFnZyI6IkFkdWx0Iiwic3ViIjoiNmY0MTFlMjUtOTcxZi00YjU1LTg2MjQtM2ExNDEyNjVjOGU4IiwiYXV0aCI6IlhCT1giLCJucyI6ImRlZmF1bHQiLCJyb2xlcyI6W10sImlzcyI6ImF1dGhlbnRpY2F0aW9uIiwiZmxhZ3MiOlsidHdvZmFjdG9yYXV0aCIsIm1zYW1pZ3JhdGlvbl9zdGFnZTQiLCJvcmRlcnNfMjAyMiIsIm11bHRpcGxheWVyIl0sInByb2ZpbGVzIjp7Im1jIjoiZjQ1ZGFhYzUtZDIyZi00ZDE5LTg2MWMtZGM3OGNiZmUwY2ViIn0sInBsYXRmb3JtIjoiVU5LTk9XTiIsIm5iZiI6MTcyOTE3Mjg5NiwiZXhwIjoxNzI5MjU5Mjk2LCJpYXQiOjE3MjkxNzI4OTZ9.tsR_MBnLg4_VjqET1NLODtQ6lRwOlAYBt2z8jFbM6UQ --userProperties {} --userType msa --width 854 --height 480");
                    case "Y", "y" -> System.out.println("modLoader is testing(Now only launch No-Mod version)");
                    case null, default -> System.out.println("ERROR:Unknown Option:" + modLoader);
                }
                System.out.println("\"run\" is testing!");
            }
            else if ("run ".equalsIgnoreCase(input))
            {
                System.out.print("Please input launch version: ");
                String ver = scanner.nextLine();
                System.out.print("Is this version have Mod Loader?[Y/n]: ");
                String modLoader = scanner.nextLine();
                switch (modLoader)
                {
                    case "N", "n" -> runMCCommands.run("\"D:\\\\Program Files\\\\Zulu\\\\zulu-8-jre\\\\bin\\\\java.exe\" -Xmx9101m -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=GB18030 -Dsun.stderr.encoding=GB18030 -Djava.rmi.server.useCodebaseOnly=true -Dcom.sun.jndi.rmi.object.trustURLCodebase=false -Dcom.sun.jndi.cosnaming.object.trustURLCodebase=false -Dlog4j2.formatMsgNoLookups=true -Dlog4j.configurationFile=F:\\Games\\Minecraft\\.minecraft\\versions\\PVP+Vape\\log4j2.xml -Dminecraft.client.jar=F:\\Games\\Minecraft\\.minecraft\\versions\\PVP+Vape\\PVP+Vape.jar -XX:+UnlockExperimentalVMOptions -XX:+UseG1GC -XX:G1NewSizePercent=20 -XX:G1ReservePercent=20 -XX:MaxGCPauseMillis=50 -XX:G1HeapRegionSize=32m -XX:-UseAdaptiveSizePolicy -XX:-OmitStackTraceInFastThrow -XX:-DontCompileHugeMethods -Dfml.ignoreInvalidMinecraftCertificates=true -Dfml.ignorePatchDiscrepancies=true -XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump -Djava.library.path=F:\\Games\\Minecraft\\.minecraft\\versions\\PVP+Vape\\natives-windows-x86_64 -Dminecraft.launcher.brand=HMCL -Dminecraft.launcher.version=3.5.9 -cp F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\mojang\\netty\\1.8.8\\netty-1.8.8.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\oshi-project\\oshi-core\\1.1\\oshi-core-1.1.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\net\\java\\dev\\jna\\jna\\3.4.0\\jna-3.4.0.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\net\\java\\dev\\jna\\platform\\3.4.0\\platform-3.4.0.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\ibm\\icu\\icu4j-core-mojang\\51.2\\icu4j-core-mojang-51.2.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\net\\sf\\jopt-simple\\jopt-simple\\4.6\\jopt-simple-4.6.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\paulscode\\codecjorbis\\20101023\\codecjorbis-20101023.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\paulscode\\codecwav\\20101023\\codecwav-20101023.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\paulscode\\libraryjavasound\\20101123\\libraryjavasound-20101123.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\paulscode\\librarylwjglopenal\\20100824\\librarylwjglopenal-20100824.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\paulscode\\soundsystem\\20120107\\soundsystem-20120107.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\io\\netty\\netty-all\\4.0.23.Final\\netty-all-4.0.23.Final.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\google\\guava\\guava\\17.0\\guava-17.0.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\commons\\commons-lang3\\3.3.2\\commons-lang3-3.3.2.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\commons-io\\commons-io\\2.4\\commons-io-2.4.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\commons-codec\\commons-codec\\1.9\\commons-codec-1.9.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\net\\java\\jinput\\jinput\\2.0.5\\jinput-2.0.5.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\net\\java\\jutils\\jutils\\1.0.0\\jutils-1.0.0.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\google\\code\\gson\\gson\\2.2.4\\gson-2.2.4.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\mojang\\authlib\\1.5.21\\authlib-1.5.21.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\com\\mojang\\realms\\1.7.59\\realms-1.7.59.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\commons\\commons-compress\\1.8.1\\commons-compress-1.8.1.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\httpcomponents\\httpclient\\4.3.3\\httpclient-4.3.3.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\commons-logging\\commons-logging\\1.1.3\\commons-logging-1.1.3.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\httpcomponents\\httpcore\\4.3.2\\httpcore-4.3.2.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\logging\\log4j\\log4j-api\\2.0-beta9\\log4j-api-2.0-beta9.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\apache\\logging\\log4j\\log4j-core\\2.0-beta9\\log4j-core-2.0-beta9.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\lwjgl\\lwjgl\\lwjgl\\2.9.4-nightly-20150209\\lwjgl-2.9.4-nightly-20150209.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\org\\lwjgl\\lwjgl\\lwjgl_util\\2.9.4-nightly-20150209\\lwjgl_util-2.9.4-nightly-20150209.jar;F:\\Games\\Minecraft\\.minecraft\\libraries\\tv\\twitch\\twitch\\6.5\\twitch-6.5.jar;F:\\Games\\Minecraft\\.minecraft\\versions\\PVP+Vape\\PVP+Vape.jar net.minecraft.client.main.Main --username shidi2023 --version PVP+Vape --gameDir F:\\Games\\Minecraft\\.minecraft --assetsDir F:\\Games\\Minecraft\\.minecraft\\assets --assetIndex 1.8 --uuid f45daac5d22f4d19861cdc78cbfe0ceb --accessToken eyJraWQiOiJhYzg0YSIsImFsZyI6IkhTMjU2In0.eyJ4dWlkIjoiMjUzNTQ0Mzg2MDUzMzUxMCIsImFnZyI6IkFkdWx0Iiwic3ViIjoiNmY0MTFlMjUtOTcxZi00YjU1LTg2MjQtM2ExNDEyNjVjOGU4IiwiYXV0aCI6IlhCT1giLCJucyI6ImRlZmF1bHQiLCJyb2xlcyI6W10sImlzcyI6ImF1dGhlbnRpY2F0aW9uIiwiZmxhZ3MiOlsidHdvZmFjdG9yYXV0aCIsIm1zYW1pZ3JhdGlvbl9zdGFnZTQiLCJvcmRlcnNfMjAyMiIsIm11bHRpcGxheWVyIl0sInByb2ZpbGVzIjp7Im1jIjoiZjQ1ZGFhYzUtZDIyZi00ZDE5LTg2MWMtZGM3OGNiZmUwY2ViIn0sInBsYXRmb3JtIjoiVU5LTk9XTiIsIm5iZiI6MTcyOTE3Mjg5NiwiZXhwIjoxNzI5MjU5Mjk2LCJpYXQiOjE3MjkxNzI4OTZ9.tsR_MBnLg4_VjqET1NLODtQ6lRwOlAYBt2z8jFbM6UQ --userProperties {} --userType msa --width 854 --height 480");
                    case "Y", "y" -> System.out.println("modLoader is testing(Now only launch No-Mod version)");
                    case null, default -> System.out.print("ERROR:Unknown Option:" + modLoader);
                }
                System.out.println("\"run\" is testing!");
            }
            else {
                // 处理用户输入的命令，你可以根据不同的命令执行相应的操作
                System.out.println("ERROR:Unknown Command:" + input);
            }
        }
    }
}
