package modul4.classwork.less1;

public class ThreadTess {


    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        //System.out.println(thread);

        int iin = Thread.activeCount();
        // System.out.println(iin);

        Thread[] threads = new Thread[iin];
        Thread.enumerate(threads);
//        for (Thread thread1 : threads) {
//            System.out.println(thread1);
//        }
//
//        MyThread myThread = new MyThread();
//        myThread.setName("My");
//        myThread.start();//run
//        Thread.sleep(5);
//        System.out.println("Hello");


//        MyRun myRun = new MyRun();//vazifa
//        Thread thread1 = new Thread(myRun,"Dia");//ishchi
//
//        thread1.start();//ishini qil

        Runnable run = () -> System.out.println(Thread.currentThread().getName());

        Thread thread1 = new Thread(run, "Di");
        thread1.start();

    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hi: " + Thread.currentThread().getName());
        }
    }

    public static class MyRun implements Runnable {

        @Override
        public void run() {
            System.out.println("Hi: " + Thread.currentThread().getName());
        }
    }
}
