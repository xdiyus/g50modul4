package modul4.homework.less2.raceSinxStatic;

public class Sinxron {


    private static int balance = 1000;

    public static synchronized void yechish(int summa) {
        if (balance >= summa) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= summa;
        }

    }

    public static int getBalance() {
        return balance;
    }
}
