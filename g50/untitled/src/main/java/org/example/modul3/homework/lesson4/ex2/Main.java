package untitled.src.main.java.org.example.modul3.homework.lesson4.ex2;

public class Main {
    public static void main(String[] args) {
        MyDoublyList<String> list= new MyDoublyList<>();
        list.add("Red");
        list.add("Green");
        list.add("White");
        list.add("Pink");
        System.out.println(list);

        System.out.println("Size: " + list.size());


        list.remove("Pink");
        System.out.println(list);
        list.remove("Green");
        System.out.println(list);
        list.remove("White");
        System.out.println(list);
        list.remove("Red");
        System.out.println(list);
    }
    }

