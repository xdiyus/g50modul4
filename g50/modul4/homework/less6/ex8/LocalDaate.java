package modul4.homework.less6.ex8;


public class LocalDaate {

    public static void sanaVaqt(String input) {

        int indexOfT = input.indexOf('T');


        String sana = input.substring(0, indexOfT);
        String vaqt = input.substring(indexOfT + 1);

        System.out.println(sana);
        System.out.println(vaqt);
    }

    public static void main(String[] args) {

        String input = "2020-07-22T08:40:50.090";
        sanaVaqt(input);


    }
}
