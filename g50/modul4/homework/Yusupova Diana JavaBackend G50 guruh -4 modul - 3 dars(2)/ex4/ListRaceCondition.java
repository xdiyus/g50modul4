package modul4.homework.less3.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListRaceCondition {
    public static void main(String[] args) {
        List<Integer> simpleList = new ArrayList<>();
        List<Integer> concurrentList = new CopyOnWriteArrayList<>();


        Runnable add = () -> {
            for (int i = 0; i < 1000; i++) {
                simpleList.add(i);
                concurrentList.add(i);
            }
        };
        Thread thread1 = new Thread(add);
        Thread thread2 = new Thread(add);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Simple List: " + simpleList.size());
        System.out.println("Concurrent List: " + concurrentList.size());
    }
}
