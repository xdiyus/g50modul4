package untitled.src.main.java.org.example.modul3.homework.lesson9.inter;

public class TestInter {
    public static void main(String[] args) {

        int start = 1;
        int end = 100;

        IterableSpecial iterableSpecial = new IterableSpecial(start, end);

        System.out.println("1 dan 100 gacha , 3 va 5 bolingan sonla: ");
        for (Integer i : iterableSpecial) {
            System.out.println(i + " ");
        }
    }
}