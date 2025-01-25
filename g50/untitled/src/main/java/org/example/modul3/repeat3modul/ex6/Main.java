package untitled.src.main.java.org.example.modul3.repeat3modul.ex6;

public class Main {

    public static void main(String[] args) {
        Simple<String> simple = new Simple<>(5);
        simple.enqueu("Diana");
        simple.enqueu("David");
        simple.enqueu("Daniel");
        simple.enqueu("Murad");

        System.out.println(simple);
        System.out.println(simple.size());
        System.out.println("----------------");
        simple.deque();
        System.out.println(simple);
        System.out.println(simple.size());
        System.out.println("----------------------");

        System.out.println(simple.peek());

    }
}
