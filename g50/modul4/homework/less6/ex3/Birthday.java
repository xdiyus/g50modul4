package modul4.homework.less6.ex3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Birthday {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tugilgan yil: ");
        int yil = scanner.nextInt();


        System.out.println("Tugilgan oyin: ");
        int oy = scanner.nextInt();


        System.out.println("Tugilgan kun: ");
        int kun = scanner.nextInt();

        LocalDate birthday = LocalDate.of(yil, oy, kun);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(birthday, bugun);

        System.out.println("Hozirgi yosh: " + period.getYears() + " yil, " + period.getMonths() + "oy, " + period.getDays() + "kun ");
    }
}
