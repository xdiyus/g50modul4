package modul4.homework.less6.ex6;

import java.time.Year;

public class Kabisa {
    public static void kabisaYil() {
        int hozirgiYear = Year.now().getValue();
        boolean kabisaYili = Year.isLeap(hozirgiYear);
        int yilDavomiyligi = kabisaYili ? 366 : 365;

        System.out.println("Joriy yil: " + hozirgiYear);
        System.out.println("Kabisa yilimi? " + (kabisaYili ? "Ha" : "Yoq"));
        System.out.println("Yilning davomiyligi: " + yilDavomiyligi + " kun");
    }

    public static void main(String[] args) {
        kabisaYil();
    }
}
