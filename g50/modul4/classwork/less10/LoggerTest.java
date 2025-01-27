package modul4.classwork.less10;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.logging.*;

public class LoggerTest {

    public static Logger logger = Logger.getLogger(LoggerTest.class.getName());

    public static void main(String[] args) throws IOException {
//      System.getProperty("java.util.loggin.config.file",
//                "/C:\\Users\\usupo\\IdeaProjects\\g50modul4\\resources/logging.properties");

        logger.setLevel(Level.INFO);

        FileHandler handler = new FileHandler("logs/filelog.txt",true);

        handler.setFormatter(new SimpleFormatter());

        logger.addHandler(handler);

        logger.log(Level.INFO, "This not log test");
       LogRecord logRecord = new LogRecord(Level.INFO,"Bu log record");
       logger.log(logRecord);
       logger.info("Info: ");
       logger.severe("Sevare: ");
       logger.warning("Warning: ");

        System.out.println(LocalDateTime.now());

    }
}
