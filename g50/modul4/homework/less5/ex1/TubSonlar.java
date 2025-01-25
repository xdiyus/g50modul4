package modul4.homework.less5.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TubSonlar extends RecursiveTask<List<Integer>> {


    private final int start;
    private final int end;


    public TubSonlar(int start, int end) {
        this.end = end;
        this.start = start;
    }

    @Override
    protected List<Integer> compute() {
        if (start == end) {
            List<Integer> tublar = new ArrayList<>();
            if (tubmi(start)) {
                tublar.add(start);
            }
            return tublar;
        } else {
            int mid = (start + end) / 2;
            TubSonlar leftTubClass = new TubSonlar(start, mid);
            TubSonlar rightTubClass = new TubSonlar(mid + 1, end);

            leftTubClass.fork();
            List<Integer> rigth = rightTubClass.compute();
            List<Integer> left = leftTubClass.join();

            left.addAll(rigth);
            return left;
        }

    }

    private boolean tubmi(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        TubSonlar tubSonlar = new TubSonlar(1, 40000);

        System.out.println("Tub sonlar...");
        long start = System.currentTimeMillis();
        List<Integer> tublar = pool.invoke(tubSonlar);
        long end = System.currentTimeMillis();

        System.out.println("Tub sonlar soni: " + tublar.size());
        System.out.println("Qanchada qilindi: " + (end - start));
    }
}
