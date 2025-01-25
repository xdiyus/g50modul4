package untitled.src.main.java.org.example.modul3.homework.lesson6.ex2;

public class Test {
    public static void main(String[] args) {
        Dictionary<Integer,String > dictionary =  new Dictionary<>();

        dictionary.put(1, "Diana");
        dictionary.put(2, "David");
        dictionary.put(3, "Doni");
        System.out.println(dictionary);


        System.out.println("Remove: " );
        dictionary.remove(1);
        System.out.println(dictionary);

    }
}
