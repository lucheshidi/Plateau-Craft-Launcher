package net.plateau.common;

import org.apache.commons.cli.*;
import org.apache.log4j.Logger;

public class Test
{

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args)
    {
        Options options = defineOptions();
        CommandLineParser parser = new DefaultParser();

        try
        {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("version")) showVersion();
            if (cmd.hasOption("launch")) handleLaunch(cmd);
            if (cmd.hasOption("download")) handleDownload(cmd);
            if (cmd.hasOption("list")) handleList();
            if (cmd.hasOption("help") || cmd.getOptions().length == 0) printHelp(options);

        } catch (ParseException e)
        {
            logger.error("Failed to parse command line options", e);
            printHelp(options);
        }
    }

    private static Options defineOptions()
    {
        return new Options()
                .addOption(new Option("?", "help", false, "help"))
                .addOption(new Option("v", "version", false, "launcher version"))
                .addOption(new Option("l", "launch", true, "launch game"))
                .addOption(new Option("d", "download", true, "download game"))
                .addOption(new Option("list", "list", false, "list versions"));
    }

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
        System.out.println("Listing versions...");
    }

    private static void printHelp(Options options)
    {
        new HelpFormatter().printHelp("net.plateau.MainCom", options);
    }
}