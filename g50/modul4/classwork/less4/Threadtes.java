package modul4.classwork.less4;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threadtes {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        /// ExecutorService executorService = Executors.newSingleThreadExecutor();
        // ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        for (int i = 0; i < 200; i++) {
            executorService.execute(runnable);
            // executorService.shutdown();//toliq bajarilishini kutadi
            ///executorService.shutdown();
            /// executorService.shutdownNow();
            try {
                executorService.shutdown();
                boolean ter = executorService.awaitTermination(200L, TimeUnit.MILLISECONDS);

                if (!ter) {
                    executorService.shutdown();
                }
                System.err.println(ter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ;


        }
    }

    public static boolean chek() {
        try {
            Thread.sleep(2000);
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

