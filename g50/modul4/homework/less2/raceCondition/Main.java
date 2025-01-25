package modul4.homework.less2.raceCondition;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        RaceCondition raceCondition = new RaceCondition();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                raceCondition.puldiYechish(200);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                raceCondition.puldiYechish(200);

            }
        });


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Qogan pul: " + raceCondition.getSumma());
    }

}
