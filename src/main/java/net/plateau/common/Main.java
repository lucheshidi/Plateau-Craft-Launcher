package net.plateau.common;

import org.apache.commons.cli.*;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

class writeFileInfo extends Thread
{
    @Override
    public void run()
    {

    }
}

public class Main
{
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args)
    {
        // 命名线程
        Runnable writeFileInfo = new writeFileInfo();
        new Thread(writeFileInfo, "write json").start();

        // 创建配置文件
        String programPath = System.getProperty("user.dir");
        String infPath = Paths.get(programPath, "plateau").toString();
        File targetDirectory = new File(infPath);
        if (!targetDirectory.exists()) {
            boolean success = targetDirectory.mkdir();
            if (success) {
                logger.info("InfPath is created successfully");
            } else {
                logger.error("Failed to create InfPath");
                return;
            }
        }
        logger.info("Program Path: " + programPath);

        // 读取配置文件
        File file = new File(infPath, "info.json");
        if (!file.exists()) {
            try {
                boolean fr = file.createNewFile();
                if (fr) {
                    logger.info("info.json file is created successfully.");
                } else {
                    logger.error("Failed to create info.json file.");
                    return;
                }
            } catch (IOException e) {
                logger.error("Error creating info.json file", e);
                return;
            }
        }

        // 获取程序绝对路径
        String filePath = file.getAbsolutePath();
        String directoryInfo = readDirectoryInfo(filePath, 1, 1);
        logger.info("Directory Info: " + directoryInfo);

        // 定义Options对象
        Options options = defineOptions();
        CommandLineParser parser = new DefaultParser();

        // 新建选项
        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("help") || cmd.getOptions().length == 0) printHelp(options);
            if (cmd.hasOption("version")) showVersion();
            if (cmd.hasOption("launch")) handleLaunch(cmd);
            if (cmd.hasOption("download")) handleDownload(cmd);
            if (cmd.hasOption("list")) handleList();
            if (cmd.hasOption("changeDir")) handleChangeDir();

        } catch (ParseException e) {
            logger.error("Failed to run command line options", e);
            printHelp(options);
        }
    }

    // 添加选项
    private static Options defineOptions()
    {
        return new Options()
                .addOption(new Option("?", "help", false, "help"))
                .addOption(new Option("v", "version", false, "launcher version"))
                .addOption(new Option("l", "launch", true, "launch game"))
                .addOption(new Option("d", "download", true, "download game"))
                .addOption(new Option("list", "list", false, "list versions"));
    }

    // 设置选项Help
    private static void printHelp(Options options)
    {
        new HelpFormatter().printHelp("net.plateau.MainCom", options);
    }

    // 设置选项ver
    private static void showVersion()
    {
        System.out.println("net.plateau.MainCom version:0.1.0");
        System.out.println("Project: https://github.com/lucheshidi/plateau");
    }

    private static void handleLaunch(CommandLine cmd)
    {
        System.out.println("Launching version: " + cmd.getOptionValue("launch"));
    }

    private static void handleDownload(CommandLine cmd)
    {
        System.out.println("Downloading version: " + cmd.getOptionValue("download"));
    }

    private static void handleList()
    {
        System.out.println("Reading versions list...");
        //
    }

    private static void handleChangeDir()
    {
        //
    }

    private static String readDirectoryInfo(String filePath, int lineNumber, int charPosition) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            int currentLineNumber = 0;

            while ((currentLine = reader.readLine()) != null) {
                currentLineNumber++;
                if (currentLineNumber == lineNumber) {
                    if (charPosition <= currentLine.length()) {
                        return currentLine.substring(charPosition - 1);
                    } else {
                        return "Error: The character position exceeds the line length.";
                    }
                }
            }

            return "Error: The file does not have the specified line number.";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error: Unable to read file.";
        }
    }
}