package modul4.homework.less3.ex3;

import java.util.concurrent.atomic.AtomicReference;

public class FloatAtomik {

    private static AtomicReference<Float> atomicReference = new AtomicReference<>(0.0f);

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                atomicReference.updateAndGet(value -> value + 4.0f);
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

        System.out.println("Float natijadi: " + atomicReference.get());
    }
}