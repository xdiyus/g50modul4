package modul4.homework.less2.raceLocker;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Locker locker = new Locker();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                locker.pulYechish(200);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                locker.pulYechish(200);

            }
        });


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
