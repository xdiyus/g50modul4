package modul4.classwork.less10;

import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class TelegramTest extends StreamHandler {


    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getLevel() == Level.SEVERE;
    }

    @Override
    public synchronized void publish(LogRecord record) {
        Formatter formatter = this.getFormatter().format(record);
        System.out.println("Buni telegramga jonatish kere" + record);
    }
}
