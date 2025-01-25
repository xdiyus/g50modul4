package modul4.homework.less2.raceSinxStatic;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                Sinxron.yechish(200);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                Sinxron.yechish(200);
            }
        });


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
