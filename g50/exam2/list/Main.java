package exam2.list;

import java.awt.image.AreaAveragingScaleFilter;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(2);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
