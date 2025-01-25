package exem.HashMapDictionary;

public class Test {

    public static void main(String[] args) {

        Hash<Integer, String> hash = new Hash<>();
        hash.put(5, "Diana");
        hash.put(9, "Wika");
        hash.put(9, "Sari");
        hash.put(9, "AS");
        hash.put(23, "Milk");
        System.out.println(hash);
        System.out.println(hash.get(9));
        hash.remove(23);
        System.out.println(hash);

    }


}
