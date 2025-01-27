package modul4.classwork.less10;

import java.text.Format;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyLocFormat extends Formatter {
    @Override
    public String format(LogRecord record) {
        Instant instant = record.getInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy'T'HH:mm:ss");
        String format = formatter.format(localDateTime);
        String sourceClassName = record.getSourceClassName();



        return "";
    }
}
