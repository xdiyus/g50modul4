package modul4.homework.less3.ex1;


///!!!!!!!!
public class VolatileMetod {

    private static volatile boolean threadTohtagan = false; ///volatile ishlatilvoti


    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {

            while (!threadTohtagan) {
                System.out.println("Thread 1 running...");
            }
            System.out.println("Thread 1 tohtagan");
        });
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                threadTohtagan = true;
                System.out.println("Thread 2 uchun true qiymat berilgan");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();

        thread2.join();


    }
}

