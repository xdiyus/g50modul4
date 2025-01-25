package untitled.src.main.java.org.example.modul3.homework.lesson3.fruits;

public interface FruitsService {
    void increasePriceByType(FruitType type, double prosent);

    void decreasePriceByType(FruitType type, double prosent);

    void removeByType(FruitType type);

    void addFruitAtIndex(int index, Fruit fruit);

    void print();
}
