package modul4.homework.less6.ex10;


public class Svetafor {


    enum Rang {
        QIZIL,
        SARIQ,
        YASHIL
    }


    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long timeLimit = 180000;

        long qizilTime = 4000;
        long sariqTime = 3000;
        long yashilTime = 5000;

        long time = System.currentTimeMillis();


        while (System.currentTimeMillis() - startTime < timeLimit) {
            long elapsedTime = System.currentTimeMillis() - time;

            if (elapsedTime < qizilTime) {
                System.out.println("Stop (Qizil)");
            } else if (elapsedTime < qizilTime + sariqTime) {
                System.out.println("Wait (Sariq)");
            } else if (elapsedTime < qizilTime + sariqTime + yashilTime) {
                System.out.println("Go (Yashil)");
            } else {
                time = System.currentTimeMillis(); // vaqtni yangilash
            }
        }


    }

}
