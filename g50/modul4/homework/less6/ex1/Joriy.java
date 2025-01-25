package modul4.homework.less6.ex1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Joriy {

    public static void getTimeDate(boolean tiime) {

        LocalDateTime hozirgiSanaVaVaqt = LocalDateTime.now();

        LocalTime hozirgiSoat = LocalTime.now();

        DateTimeFormatter sanaVaqt = DateTimeFormatter.ofPattern("yyyy-MM-dd | HH:mm:ss");
        DateTimeFormatter sana = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter soat = DateTimeFormatter.ofPattern("HH:mm:ss");

        if (tiime) {
            System.out.println("Joriy sana va vaqt: " + hozirgiSanaVaVaqt.format(sanaVaqt));

        } else {
            System.out.println("Joriy sana: " + hozirgiSanaVaVaqt.format(sana));
            System.out.println("Joriy vaqt: " + hozirgiSanaVaVaqt.format(soat));
        }
    }

    public static void main(String[] args) {
        getTimeDate(true);
        System.out.println();
        getTimeDate(false);
    }
}
