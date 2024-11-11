package net.plateau.common.util.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class runCommands {

    public static String execute(String command) {
        Charset charset = System.getProperty("os.name").toLowerCase().contains("win") ? Charset.forName("GBK") : Charset.defaultCharset();
        String os = System.getProperty("os.name").toLowerCase();
        List<String> commands = new ArrayList<>();

        // 判断操作系统类型，并准备命令
        if (os.contains("win")) {
            // Windows
            commands.add("cmd");
            commands.add("/c");
        } else {
            // Unix/Linux/MacOS
            commands.add("/bin/sh");
            commands.add("-c");
        }

        commands.add(command);

        // 执行命令并获取结果
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(commands);
            Process process = processBuilder.start();

            // 获取输出
            String output = readStream(process.getInputStream(), charset);
            // 等待进程结束
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                return output;
            } else {
                String error = readStream(process.getErrorStream(), charset);
                throw new IOException("Command execution failed with exit code " + exitCode + " and error: " + error);
            }
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Error: " + e.getMessage();
        }
        // 示例命令
    }

    private static String readStream(InputStream inputStream, Charset charset) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
            builder.append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }

    public static void runCommands(String args) {
        // 示例命令
        String command = args;
        // 在Windows上使用GBK编码读取输出，在Linux上使用系统默认编码
        String result = runCommands.execute(command);
        System.out.println(result);
    }
}