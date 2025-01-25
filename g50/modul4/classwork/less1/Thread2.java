package modul4.classwork.less1;

public class Thread2 {


    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();
        Runnable task1 = () -> method1();
        Runnable task2 = () -> method2();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        long l = System.currentTimeMillis();
        thread1.join(3000);

        System.out.println("Tushti: " + (System.currentTimeMillis() - l));
        thread2.start();
        System.out.println("END");
        long after = System.currentTimeMillis();
        System.out.println("Time taken " + (after - before));
    }

    private static void method1() {
        try {
            Thread.sleep(200);
            System.out.println(Thread.currentThread().getName() + " : metod 1");


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void method2() {
        try {
            Thread.sleep(400);
            System.out.println(Thread.currentThread().getName() + " : metod 2");


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}