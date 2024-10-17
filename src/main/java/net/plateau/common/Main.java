package net.plateau.common;

import net.plateau.common.util.writeFileInfo;
import net.plateau.common.util.createCommands;
import net.plateau.common.util.commands.runMCCommands;

/**
 * @author shidi
 *
 *
 * @apiNote
 * This is the Plateau Launcher Command version.
 * The GUI version is stop exploitation.
 *
 * (c)Copyright Plateau
 * 2024.10.11
 *
 * @version 0.1.5
 */

public class Main
{
    public static void main(String[] args)
    {
        writeFileInfo.writeInfo();

        String programPath = System.getProperty("user.dir");

        System.out.println("Welcome to Plateau Launcher");
        System.out.println("(c)Copyright net.plateau");
        String consolefolder = "C:\\";
        String runMCCommand = "";

        createCommands.Create();
    }
}