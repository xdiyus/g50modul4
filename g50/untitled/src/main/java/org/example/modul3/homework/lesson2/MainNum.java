package untitled.src.main.java.org.example.modul3.homework.lesson2;

public class MainNum {
    public static void main(String[] args) {
        DynamicNumberArray<Integer> intArray = new DynamicNumberArray<>();
        intArray.add(10);
        intArray.add(20);
        intArray.add(30);
        System.out.println(intArray);

        System.out.println("Get element 1 : " + intArray.get(1));

        intArray.remove(1);
        System.out.println("After delete element 1 :  " + intArray.get(1));
        System.out.println(intArray);

    }
}
