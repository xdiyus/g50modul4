package untitled.src.main.java.org.example.modul3.homework.lesson3.names;

import java.util.*;

public class Name {

    public List<String> names() {

        List<String> names = new ArrayList<>();

        names.add("Diana");
        names.add("Sitora");
        names.add("Gulnoza");
        names.add("Jaxa");
        names.add("Alina");
        names.add("Sofa");
        names.add("Aziza");
        names.add("Rahim");
        names.add("David");
        names.add("kelvin");
        names.add("Diana");
        names.add("Sitora");
        names.add("Gulnoza");
        names.add("Jaxa");
        names.add("Alina");
        names.add("Sofa");
        names.add("Aziza");
        names.add("Rahim");
        names.add("David");
        names.add("kelvin");
        return names;

    }


    public List<String> delete(List<String> names) {

        Set<String> nameDelete = new HashSet<>();
        nameDelete.addAll(names);
        return new ArrayList<>(nameDelete);
    }


    public void printIterator(List<String> names) {

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
