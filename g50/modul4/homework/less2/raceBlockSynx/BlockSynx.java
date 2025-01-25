package modul4.homework.less2.raceBlockSynx;

public class BlockSynx {

    private int balance = 1000;

    public void yechish(int summa) {
        synchronized (this) {
            if (balance >= summa) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= summa;
            }
        }
    }

    public int getBalance() {
        return balance;
    }
}
