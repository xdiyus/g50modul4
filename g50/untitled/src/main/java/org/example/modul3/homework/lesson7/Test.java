package untitled.src.main.java.org.example.modul3.homework.lesson7;

public class Test {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(5);
        linkedHashMap.put(15, "Text 1");
        linkedHashMap.put(16, "Text 2");
        linkedHashMap.put(17, "Text 3");
        linkedHashMap.put(25, "Text 4");
        linkedHashMap.put(35, "Text 5");
        System.out.println(linkedHashMap);
        linkedHashMap.put(18, "Text 6");
        System.out.println(linkedHashMap);

    }


}
