package untitled.src.main.java.org.example.modul3.homework.lesson10.Inter;

import javax.sound.midi.Soundbank;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Language {

    public static void main(String[] args) {
        Locale french = Locale.FRENCH;
        Locale uz = Locale.forLanguageTag("uz");
        Locale enGb = Locale.forLanguageTag("en");

        date(enGb);
        date(uz);
        date(french);
        System.out.println("-----------------------");

        number(enGb);
        number(uz);
        number(french);
    }

    private static void date(Locale locale) {

        Date date = new Date();

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String format = dateFormat.format(date);
        System.out.println(locale + " -> " + format);
    }

    private static void number(Locale locale) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        double num = 12345.67;

        String formatedNum = numberFormat.format(num);
        System.out.println(locale + " -> " + formatedNum);

    }
}
