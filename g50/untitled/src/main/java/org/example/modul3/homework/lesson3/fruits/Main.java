package untitled.src.main.java.org.example.modul3.homework.lesson3.fruits;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(FruitType.SITRUS, "Apelsin", 3.0));
        fruits.add(new Fruit(FruitType.SITRUS, "Greyfrut", 8.0));
        fruits.add(new Fruit(FruitType.SITRUS, "Ananas", 5.0));
        fruits.add(new Fruit(FruitType.SITRUS, "Mandarin", 2.0));
        fruits.add(new Fruit(FruitType.SITRUS, "Laym", 21.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Olma", 3.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Malina", 4.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Taruz", 10.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Mango", 14.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Xurmo", 6.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Ejevika", 9.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Qulpnay", 6.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Qovun", 7.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Dovcha", 13.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Gilos", 5.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Olcha", 6.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Nok", 13.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Anor", 9.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Gilos", 9.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Banan", 3.0));
        fruits.add(new Fruit(FruitType.XOLMEVA, "Drakon frukt", 22.0));


        FruitsService fruitsService = new FruitsImpl(fruits);

        fruitsService.print();
        System.out.println();


        fruitsService.decreasePriceByType(FruitType.XOLMEVA, 20);
        fruitsService.increasePriceByType(FruitType.SITRUS, 10);
        fruitsService.print();
        System.out.println();


        fruitsService.addFruitAtIndex(3, new Fruit(FruitType.SITRUS, "Limon", 18.0));

        fruitsService.removeByType(FruitType.SITRUS);
        fruitsService.print();

    }
}