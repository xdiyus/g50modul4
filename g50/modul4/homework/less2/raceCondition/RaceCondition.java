package modul4.homework.less2.raceCondition;

public class RaceCondition {

    private int summa = 2000;

    public int getSumma() {
        return summa;
    }


    public void puldiYechish(int sumasi) {
        if (summa > sumasi) {

            try {

                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            summa -= sumasi;
        }


    }


}
