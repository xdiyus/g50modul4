package modul4.homework.less3.ex2;

import java.util.concurrent.atomic.AtomicLong;

public class LongCount {

    private static long count = 0;
    private static AtomicLong atomicLong = new AtomicLong(0);

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                count += 2;
                atomicLong.addAndGet(2);
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Count natija: " + count);
        System.out.println("Atomic count natija: " + atomicLong.get());
    }
}
