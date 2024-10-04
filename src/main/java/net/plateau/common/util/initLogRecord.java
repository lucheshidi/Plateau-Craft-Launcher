package net.plateau.common.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;

public class initLogRecord {
    private static final Logger logger = Logger.getLogger(initLogRecord.class);

    public static void initLog() {
        // 设置日志格式
        PatternLayout layout = new PatternLayout();
        String conversionPattern = "[%d{yyyy-MM-dd - HH:mm:ss.SSS}][%t][!%-5p][%c{1}]: %m%n";
        layout.setConversionPattern(conversionPattern);

        // 创建控制台Appender并将其添加到logger中
        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setLayout(layout);
        consoleAppender.activateOptions();

        // 清空现有的Appender并添加新的
        logger.removeAllAppenders();
        logger.addAppender(consoleAppender);
        logger.setLevel(Level.INFO);

        // 记录初始化日志
        logger.info("Log initialization begins");
        logger.info("Log initialization successful");
    }
}