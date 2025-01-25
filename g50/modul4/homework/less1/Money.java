package modul4.homework.less1;

public class Money {

//    public void transfer(Card from, Card to, int summa) {
//
//        checkBlocked(from);
//        checkBlocked(to);
//        yetadimiPul(from, summa);
//
//        from.setBalance(from.getBalance() - summa);
//        to.setBalance(to.getBalance() + summa);
//        System.out.println("Success!  ");
//    }


    public void runTrans(Card from, Card to, int summa) {
        Thread test1 = new Thread(() -> checkBlocked(from));
        test1.start();
        Thread test2 = new Thread(() -> checkBlocked(to));
        test2.start();
        Thread test3 = new Thread(() -> yetadimiPul(from, summa));
        test3.start();


        try {
            test1.join();
            test2.join();
            test3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        from.setBalance(from.getBalance() - summa);
        to.setBalance(to.getBalance() + summa);
        System.out.println("Success! ");

    }

    public void checkBlocked(Card card) {

        try {
            Thread.sleep(1500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (card.isBlocked()) {
            System.out.println("Bloklangan! ");
        }
    }


    public void yetadimiPul(Card card, int amount) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException exception) {
            throw new RuntimeException(exception);
        }
        if (card.getBalance() < amount) {
            throw new RuntimeException("Pul yetmayapti! ");
        }


    }
}
