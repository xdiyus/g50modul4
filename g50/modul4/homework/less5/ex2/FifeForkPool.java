package modul4.homework.less5.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class FifeForkPool extends RecursiveTask<List<Integer>> {
    private final int start;
    private final int end;


    public FifeForkPool(int start, int end) {
        this.end = end;
        this.start = start;
    }


    @Override

    protected List<Integer> compute() {
        List<Integer> list = new ArrayList<>();
        if ((end - start) <= 1000) {
            for (int i = start; i <= end; i++) {
                if (i % 5 == 0) {
                    list.add(i);
                }
            }
            return list;
        } else {
            int mid = (start + end) / 2;
            FifeForkPool leftTask = new FifeForkPool(start, mid);
            FifeForkPool rightTask = new FifeForkPool(mid + 1, end);

            leftTask.fork();
            List<Integer> right = rightTask.compute();
            List<Integer> left = leftTask.join();

            left.addAll(right);
            return left;
        }

    }
}

