package modul4.homework.less6.ex2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class FarqVaqt {

    public static void different(int hours, int minutes, int sekund) {
        LocalTime time = LocalTime.of(hours, minutes, sekund);

        LocalTime hozirgiVaqt = LocalTime.now();

        Duration duration = Duration.between(time, hozirgiVaqt);

        long s = Math.abs(duration.getSeconds());
        long h = s / 3600;
        long m = (s % 3600) / 60;
        s = s % 60;

        System.out.println("Vaqt raznitsa:" + h + " soat, " + m + "minut," + s + "sekund ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Soat: ");
        int inputHours = scanner.nextInt();

        System.out.print("Minut: ");
        int inputMinutes = scanner.nextInt();

        System.out.print("Sekund: ");
        int inputSeconds = scanner.nextInt();


        different(inputHours, inputMinutes, inputSeconds);
    }
}

