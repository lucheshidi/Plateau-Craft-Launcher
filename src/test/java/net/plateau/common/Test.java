package net.plateau.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String filePath = "plateau.json";
        String directoryInfo = readDirectoryInfo(filePath, 10, 11);
        System.out.println("Directory Info: " + directoryInfo);
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