package modul4.homework.less2.raceBlockSynx;

import java.util.Collections;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        BlockSynx blockSynx = new BlockSynx();

        Thread thread1 = new Thread(() -> blockSynx.yechish(200));

        Thread thread2 = new Thread(() -> blockSynx.yechish(200));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();



        System.out.println("Qogan pul: " + blockSynx.getBalance());
    }


}
