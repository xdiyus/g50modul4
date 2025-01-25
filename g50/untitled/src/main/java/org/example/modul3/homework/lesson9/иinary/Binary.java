package untitled.src.main.java.org.example.modul3.homework.lesson9.иinary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary {

    public static <T extends Comparable<T>> T binarySearch(List<T> list, T num) {

        int count = 0;
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            count++;
            if (list.get(mid).compareTo(num) == 0) {
                System.out.println("Qanchada topkani: " + count);
                return list.get(mid);
            } else if (list.get(mid).compareTo(num) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(5, 2, 91, 61, 33, 41, 54));
        Collections.sort(list);


        System.out.println("Sort: " + list);

        int findNum = 2;
        Integer result = binarySearch(list, findNum);

        if (result != null) {
            System.out.println("Topildi " + result);
        } else {
            System.out.println("Topilmadi ");
        }

        System.out.println("-------------------------------------");
        List<String> stringList = new ArrayList<>(List.of("Cherry", "Milk", "Apple", "Meat", "Lemon"));
        Collections.sort(stringList);

        System.out.println("Sort (String): " + stringList);

        String findString = "Apple";
        String resultString = binarySearch(stringList, findString);

        if (resultString != null) {
            System.out.println("Topildi (String): " + resultString);
        } else {
            System.out.println("Topilmadi (String)");
        }


    }
}
