package exem.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dynamic<String> array = new Dynamic<>();

        array.add("Diana");
        array.add("Dian");
        array.add("Dia");
        array.add("Di");
        System.out.println(array);
        System.out.println(array.get(3));

        array.remove(1);
        System.out.println(array);
    }
}
