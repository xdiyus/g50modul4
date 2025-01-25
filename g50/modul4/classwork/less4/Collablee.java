package modul4.classwork.less4;

import java.sql.SQLOutput;
import java.util.concurrent.*;

public class Collablee {

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        transfer("4567", "45678", 4000);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

    }


    public static void transfer(String from, String to, long amount) {


        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Callable<Boolean> validCardFrom = () -> cardChek(from);
        Callable<Boolean> validCardTo = () -> cardChek(to);
        Callable<Boolean> validCardChecked = () -> checkBalance(from, amount);

        Future<Boolean> fromCardFuture = executorService.submit(validCardFrom);
        Future<Boolean> toCardFuture = executorService.submit(validCardTo);
        Future<Boolean> checkFuture = executorService.submit(validCardChecked);

        try {

            Boolean fromCard = fromCardFuture.get();
            Boolean toCard = toCardFuture.get();
            Boolean check = checkFuture.get();

            if (fromCard && toCard && check) {
                System.out.println("Transting...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Tranzaksiya tugadi. ");
            } else {
                System.out.println("Tranzaksiya tugamadi");
            }

        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }


    public static boolean cardChek(String num) {

        try {
            System.out.println("Card check");
            Thread.sleep(200);
            System.out.println("Cheked!");
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean checkBalance(String toCard, long amount) {
        try {
            System.out.println("Card balance checking ");
            Thread.sleep(2000);
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
