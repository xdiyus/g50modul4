package modul4.homework.less2.raceInstanceSynx;

public class SynxMetod {


    private int summa = 1000;


    public synchronized void pulYechish(int summasi) {

        if (summa >= summasi) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            summa -= summasi;
        }
    }

    public int getSumma() {
        return summa;
    }
}
