package modul4.homework.less5.ex3;

public class Singlton {

    private static volatile Singlton singlton;

    private Singlton() {
        System.out.println("Singlton....");
    }

    public static Singlton getSinglton() {
        if (singlton == null) {
            synchronized (Singlton.class) {
                if (singlton == null) {
                    singlton = new Singlton();
                }
            }
        }
        return singlton;
    }

    @Override
    public String toString() {
        return "Singleton instansiyasi";
    }
}

class Main {
    public static void main(String[] args) {
        Singlton singlton1 = Singlton.getSinglton();
        Singlton singlton2 = Singlton.getSinglton();

        System.out.println("1 Singlton: " + singlton1);
        System.out.println("2 Singlton: " + singlton2);

        if (singlton1 == singlton2) {
            System.out.println("Natija: 2-ta singlton bir xil instinsga ega");
        } else {
            System.out.println("Har hilcha!");
        }
    }
}
