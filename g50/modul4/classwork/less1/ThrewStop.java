package modul4.classwork.less1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ThrewStop {

    public static void main(String[] args) {

        Runnable runnable = () -> {

            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " ishladi ");
            } catch (InterruptedException exception) {
                throw new RuntimeException(exception);
            }

        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
