package untitled.src.main.java.org.example.modul3.homework.lesson3.names;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Name nameList = new Name();

        List<String> names = nameList.names();

        List<String> cleanNames = nameList.delete(names);
        System.out.println("Список без дубликатов:");
        nameList.printIterator(cleanNames);


    }
}
