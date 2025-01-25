package modul4.classwork.less5;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MeRecurs extends RecursiveTask<Integer> {
    private final int[] array;
    private final int minForkSize;
    private final int start;
    private final int end;


    public MeRecurs(int[] array, int minForkSize, int start, int end) {
        this.array = array;
        this.minForkSize = minForkSize;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start > minForkSize) {
            int middle = (start + end) / 2;
            MeRecurs left = new MeRecurs(array, minForkSize, start, middle);
            MeRecurs rigth = new MeRecurs(array, minForkSize, middle, end);
            invokeAll(left, rigth);
            return left.invoke() + rigth.invoke();
        } else {
            int counter = 0;
            for (int i = start; i < end; i++) {
                if (array[i] % 2 == 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter++;
                }

            }
            return counter;
        }


    }
}


    class Main {
        public static void main(String[] args) {
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }

            int minForkSize = 10;

            ForkJoinPool pool = new ForkJoinPool();
            MeRecurs task = new MeRecurs(array, minForkSize, 0, array.length);

            int juftCount = pool.invoke(task);

            System.out.println("Juft sonla: " + juftCount);
        }
    }

