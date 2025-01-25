package modul4.classwork.less6;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        date1.setTime(date1.getTime()+2*60*60*1000);
        System.out.println(date1);
//        date1.setTime(345678L);
//



    }
}
