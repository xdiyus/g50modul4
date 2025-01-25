package modul4.classwork.less8;

import javax.management.relation.RoleInfoNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternnEX {

    public static void main(String[] args) {


//        numberChek();
//        nomer();

        Matcher matcher = nomer();

        String str = "dfghjk45678o";

        StringBuilder num = new StringBuilder();
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println(num.toString());
        String number = str.replaceAll("\\D", "");
        System.out.println(number);

//
//        if (!matcher.find()) {
//
//            throw new RuntimeException("Error");
//        } else {
//            System.out.println(matcher.group());
//        }
//        if (matcher.find()) {
//            System.out.println(matcher.group());
//        }


//        for(;matcher.find();){
//            System.out.println(matcher.group());
//        }


    }

    private static Matcher nomer() {

        Pattern compile = Pattern.compile("\\+998[0-9]{9}$");
        Matcher matcher = compile.matcher("+998900987988");
        return matcher;
    }

    private static void numberChek() {

        Matcher matcher = nomer();
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }


}
