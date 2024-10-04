package net.plateau.common;

import org.apache.commons.cli.*;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import net.plateau.common.util.initLogRecord;
import org.testng.annotations.Test;

class writeFileInfo extends Thread
{
    @Override
    public void run()
    {

    }
}

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("删除单个文件" + fileName + "成功！");
                return true;
            } else {
                System.out.println("删除单个文件" + fileName + "失败！");
                return false;
            }
        } else {
            System.out.println("delete one file fail:" + fileName + "file does no exist!");
            return false;
        }
    }

    public static void main(String[] args) {
        logger.warn("Starting net.plateau.MainCom...");
        initLogRecord.initLog();
        // 命名线程
        Runnable writeFileInfo = new writeFileInfo();
        new Thread(writeFileInfo, "write json").start();

        // 创建配置文件
        String programPath = System.getProperty("user.dir");
        String infPath = Paths.get(programPath, "plateau").toString();
        File targetDirectory = new File(infPath);
        if (!targetDirectory.exists()) {
            logger.info("Program Path: " + programPath);
        } else {
            return;
        }
        File launchScript = new File(infPath + "/latest-launch.bat");

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
            logger.warn("Plateau is exit");
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

    //删除旧的日志
    String programPath = System.getProperty("user.dir");
    String infPath = Paths.get(programPath, "plateau").toString();

    void testDeleteFileDir1() {
        File file = new File(programPath + "plateau/logs/latest.log");
        boolean deleted = file.delete();
        if (!deleted) {
            logger.info("The last profile has been deleted failed");
        } else {
            logger.info("The last profile has been deleted successful");
        }
    }

    // 添加选项
    private static Options defineOptions() {
        return new Options()
                .addOption(new Option("?", "help", false, "help"))
                .addOption(new Option("v", "version", false, "launcher version"))
                .addOption(new Option("l", "launch", true, "launch game"))
                .addOption(new Option("d", "download", true, "download game"))
                .addOption(new Option("li", "list", false, "list versions"))
                .addOption(new Option("cd", "chand", true, "change directory"));
    }

    // 设置选项Help
    private static void printHelp(Options options) {
        new HelpFormatter().printHelp("net.plateau.MainCom", options);
    }

    // 设置选项ver
    private static void showVersion() {
        System.out.println("\nnet.plateau.MainCom version: v0.1.0-Alpha");
        System.out.println("Project: https://github.com/lucheshidi/Plateau-Craft-Launcher-Command\n");
    }

    private static void handleLaunch(CommandLine cmd) {
        System.out.println("Launching version: " + cmd.getOptionValue("launch") + "...");
    }

    private static void handleDownload(CommandLine cmd) {
        System.out.println("Downloading version: " + cmd.getOptionValue("download") + "...");
    }

    private static void handleList() {
        System.out.println("Reading versions list...");
        //
    }

    private static void handleChangeDir() {
        System.out.println("Changing directory to\" + changedDir + \" ...");
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
