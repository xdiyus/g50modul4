package untitled.src.main.java.org.example.modul3.homework.lesson3.fruits;

import java.util.Iterator;
import java.util.List;

public class FruitsImpl implements FruitsService {

    private List<Fruit> fruitList;

    public FruitsImpl(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    @Override
    public void increasePriceByType(FruitType type, double prosent) {
        for (Fruit fruit : fruitList) {
            if (fruit.getFruitType().equals(type)) {
                double newPrice = fruit.getPrice() * (1 + prosent / 100);
                fruit.setPrice(newPrice);
            }
        }
        System.out.println("Xol meva " + prosent + " % ga narxi oshti");
    }

    @Override
    public void decreasePriceByType(FruitType type, double prosent) {
        for (Fruit fruit : fruitList) {
            if (fruit.getFruitType().equals(type)) {
                double newPrice = fruit.getPrice() * (1 - prosent / 100);
                fruit.setPrice(newPrice);

            }
        }
        System.out.println("Sitrus meva " + prosent + "  % ga narxi tushti");
    }

    @Override
    public void removeByType(FruitType type) {

        Iterator<Fruit> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();
            if (fruit.getFruitType().equals(type)) {
                iterator.remove();
            }
        }

    }

    @Override
    public void addFruitAtIndex(int index, Fruit fruit) {
        if (index >= 0 && index <= fruitList.size()) {
            fruitList.add(index, fruit);
        }

    }

    @Override
    public void print() {
        Iterator<Fruit> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }
}
