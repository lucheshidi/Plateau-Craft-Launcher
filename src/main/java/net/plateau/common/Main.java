package net.plateau.common;

import net.plateau.common.util.writeInfo.writeConfigFileInfo;
import net.plateau.common.util.createOptions;
import net.plateau.common.util.writeInfo.createConfigFile;

import java.io.IOException;

/**
 * Copyright Plateau(c)
 * All rights reserved
 * 2024.10
 *
 * @author lucheshidi
 *
 * @apiNote
 * This is the Plateau Launcher Command version.
 * The GUI version is stop exploitation.
 * @see net.plateau.common.util.help.rights
 * @see <a href=https://github.com/lucheshidi/Plateau-Craft-Launcher></a>
 *
 * @version 0.1.5
 */

public class Main {
    public static void main(String[] args) throws IOException {
        String programPath = System.getProperty("user.dir");

        System.out.println("Welcome to Plateau Launcher");
        writeConfigFileInfo.write();
        createConfigFile.create();

        System.out.println("(c)Copyright net.plateau");
        System.out.println("if want help, input\"?, help, h\"");

        createOptions.Create();
    }
}