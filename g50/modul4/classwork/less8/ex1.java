package modul4.classwork.less8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static void main(String[] args) {
        //harf();
        //son();
        belgiRaqam();
        //space();

    }

    private static Matcher harf() {
        Pattern compile = Pattern.compile("[a-zA-Z]");
        Matcher matcher = compile.matcher("4567xcvfgbhnj");
        while (matcher.find()) {
            System.out.print(" Topildi harf: " + matcher.group());

        }
        return matcher;

    }


    private static Matcher son() {
        Pattern compile = Pattern.compile("[0-9]");
        Matcher matcher = compile.matcher("520vbn");
        while (matcher.find()) {
            System.out.print(" Topildi harf: " + matcher.group());

        }
        return matcher;

    }


    private static Matcher belgiRaqam() {
        Pattern compile = Pattern.compile("[0-9[^\\w]]");
        Matcher matcher = compile.matcher("520vb.n");
        while (matcher.find()) {
            System.out.println(" Topildi : " + matcher.group());

        }
        return matcher;

    }

    private static Matcher space() {
        Pattern compile = Pattern.compile("\\s");
        Matcher matcher = compile.matcher("520vb  .n");
        while (matcher.find()) {
            System.out.println(" Topildi : " + matcher.group());

        }
        return matcher;

    }


}

