package net.plateau.common.gson;

import org.jline.reader.*;
import org.jline.reader.impl.DefaultParser;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Terminal terminal = TerminalBuilder.builder().system(true).build();
        LineReader reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .parser(new DefaultParser())
                .build();

        System.out.println("Welcome to the enhanced CLI. Type 'exit' to quit.");

        while (true) {
            try {
                String line = reader.readLine("\nENHANCED CLI> ");
                if ("exit".equalsIgnoreCase(line)) {
                    System.out.println("Goodbye!");
                    break;
                }

                // 解析并处理命令
                processCommand(line.trim());
            } catch (UserInterruptException e) {
                System.out.println("Interrupted!");
                break;
            } catch (EndOfFileException e) {
                break;
            }
        }
    }

    private static void processCommand(String input) {
        if (input.isEmpty()) return;
        String[] parts = input.split("\\s+");
        String command = parts[0];
        switch (command) {
            case "help":
                System.out.println("Available commands: help, exit, echo <text>");
                break;
            case "echo":
                if (parts.length > 1) {
                    System.out.println(input.substring(5)); // 输出后续内容
                }
                else {
                    System.out.println("Usage: echo <text>");
                }
                break;
            case "apt":
                if (parts.length > 1) {
                    System.out.println(input.substring(4)); // 输出后续内容
                }

            default:
                System.out.println("Unknown command: " + command);
        }
    }
}
