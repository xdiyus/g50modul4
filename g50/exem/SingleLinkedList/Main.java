package exem.SingleLinkedList;

public class Main {

    public static void main(String[] args) {

        SingleList<String> list = new SingleList<>();
        list.add("Gigi");
        list.add("Kendall");
        list.add("Kylie");
        list.add("Bella");
        System.out.println(list);
        System.out.println("Index: " + list.getElemett(2));
        list.setElementt("Sarik", 2);
        System.out.println(list);
        list.remove("Bella");
        System.out.println(list);
    }
}
