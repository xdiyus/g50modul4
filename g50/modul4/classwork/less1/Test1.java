package modul4.classwork.less1;

import modul4.homework.less1.Card;
import modul4.homework.less1.Money;

public class Test1 {
    public static void main(String[] args) {


        Card card1 = new Card(500, false, "123456789");
        Card card2 = new Card(500, false, "9876544321");

        Money money = new Money();

        long start = System.currentTimeMillis();
        money.runTrans(card1, card2, 200);
        long end = System.currentTimeMillis();

        System.out.println("Taken: " + (end - start));
    }
}