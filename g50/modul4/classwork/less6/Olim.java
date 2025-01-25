package modul4.classwork.less6;

import java.time.LocalDate;

public class Olim {


    public static void main(String[] args) {
        LocalDate start;
        start = LocalDate.of(2022,1,1);
        LocalDate today =LocalDate.now();

        long hours = 0;

        LocalDate date = start;

        while (!date.isAfter(today)){
            int month = date.getMonthValue();
            if(month>=3 && month<=5 || month>=9 && month<=11){
                hours +=5*8;
            }else{
                hours+=3*7;
            }
            date = date.plusDays(1);
        }
        System.out.println("Olim:" + hours + " soat ishlagan " + start +" dan" );
    }
}
