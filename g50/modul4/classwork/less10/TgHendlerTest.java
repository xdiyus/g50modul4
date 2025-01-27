package modul4.classwork.less10;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class TgHendlerTest extends Handler {
    public static Logger logger = Logger.getLogger(TgHendlerTest.class.getName());

    public static void main(String[] args) {
        TgHendlerTest tgHendlerTest = new TgHendlerTest();
        logger.addHandler(tgHendlerTest);
        logger.info("This is not senr Tg");
        exeptionTg();
    }

    private static void exeptionTg() {
        try {
            throw new RuntimeException("error");
        } catch (Exception e) {
            Logger logger1 = logger;
        }
    }

    @Override
    public void publish(LogRecord record) {

    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}
