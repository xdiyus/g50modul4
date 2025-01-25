package modul4.homework.less2.raceLocker;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locker {

    private int summa = 1000;
    private Lock locker = new ReentrantLock();


    public void pulYechish(int summasi) {
        locker.lock();
        try {
            if (summa > summasi) {
                Thread.sleep(100);
                summa -= summasi;

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            locker.unlock();
        }
    }

    public int getSumma() {
        return summa;
    }
}
