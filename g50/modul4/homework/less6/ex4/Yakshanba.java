package modul4.homework.less6.ex4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Yakshanba {


    public static String keyingiYakshanba(LocalDate sana) {

        int bugungiKun = sana.getDayOfWeek().getValue();
        int kunQoshish = 7 - bugungiKun;
        if (kunQoshish == 7) {
            kunQoshish = 0;
        }

        LocalDate keyingiSunday = sana.plusDays(kunQoshish);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        return keyingiSunday.format(format);
    }

    public static String oldingiYakshanba(LocalDate kun) {
        int bugungiKun = kun.getDayOfWeek().getValue();
        int oldingiKunla = bugungiKun;
        if (bugungiKun == 7) {
            oldingiKunla = 7;
        }

        LocalDate oldingiYakshanba = kun.minusDays(oldingiKunla);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        return oldingiYakshanba.format(formatter);
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        String oldingi = oldingiYakshanba(localDate);
        String keyingi = keyingiYakshanba(localDate);

        System.out.println("Oldingi: " + oldingi);
        System.out.println("Keyingi:" + keyingi);
    }
}
