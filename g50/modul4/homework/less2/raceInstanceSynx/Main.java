package modul4.homework.less2.raceInstanceSynx;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SynxMetod synxMetod = new SynxMetod();


        Thread thread1 = new Thread(() -> synxMetod.pulYechish(200));
        Thread thread2 = new Thread(() -> synxMetod.pulYechish(200));


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Qogan pul : " + synxMetod.getSumma());
    }
}
