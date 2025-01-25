package modul4.classwork.less6;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendartest {
    public static void main(String[] args) {
//        Calendar calendar = new GregorianCalendar();
//        System.out.println(calendar);
//
//        Date oldDate = calendar.getTime();
//        System.out.println(oldDate);
//         calendar.add(Calendar.HOUR,2);

//        Date date = calendar.getTime();
//        System.out.println(date);
//
//        int daysInFirstWeek = calendar.getMinimalDaysInFirstWeek();
//        System.out.println(daysInFirstWeek);

//        int weekYear = calendar.getWeekYear();
//        System.out.println(weekYear);

        //int day = Calendar.getInstance().get()
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,0,1,0,0);
        Date date = calendar.getTime();
        System.out.println(date);

        Calendar start = Calendar.getInstance();


    }
}
