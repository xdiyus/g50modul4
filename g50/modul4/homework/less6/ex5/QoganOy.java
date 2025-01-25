package modul4.homework.less6.ex5;

import java.time.LocalDate;

public class QoganOy {

    public static void qolganOylik() {

        int currentYear = LocalDate.now().getYear();


        int currentMonth = LocalDate.now().getMonthValue();


        int qolganOylik = 12 - currentMonth;


        System.out.println("Joriy yilda qolgan oylar soni: " + qolganOylik);
    }

    public static void main(String[] args) {
        qolganOylik();
    }
}
