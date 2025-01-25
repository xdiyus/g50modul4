package untitled.src.main.java.org.example.modul3.homework.lesson5.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Fruit> fruitSet = new LinkedHashSet<>();

        fruitSet.add(new Fruit("Banana", 20.0));
        fruitSet.add(new Fruit("Apple", 20.0));
        fruitSet.add(new Fruit("Mango", 20.0));
        fruitSet.add(new Fruit("Orange", 40.0));
        fruitSet.add(new Fruit("Lemon", 20.0));
        fruitSet.add(new Fruit("Cherry", 20.0));
        fruitSet.add(new Fruit("Grape", 20.0));
        fruitSet.add(new Fruit("Dragon fruit", 20.0));
        fruitSet.add(new Fruit("Kiwi", 20.0));
        fruitSet.add(new Fruit("Blueberries", 20.0));
        fruitSet.add(new Fruit("Peach", 20.0));

        for (Fruit fruit : fruitSet) {
            System.out.println(fruit);
        }
    }
}
