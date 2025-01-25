package untitled.src.main.java.org.example.modul3.homework.lesson4.ex1;

public class Main {

    public static void main(String[] args) {

        MyList<String> color = new MyList<>();
        color.add("Red");
        color.add(null);
        color.add("Green");
        color.add("White");
        color.add("Pink");
        System.out.println(color);

        System.out.println("Size: " + color.size());
    color.remove("Pink");
        System.out.println(color);
    }
}
