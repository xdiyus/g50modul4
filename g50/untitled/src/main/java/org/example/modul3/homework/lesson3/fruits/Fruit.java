package untitled.src.main.java.org.example.modul3.homework.lesson3.fruits;

public class Fruit {

    private String name;
    private double price;
    private FruitType fruitType;

    public Fruit(FruitType fruitType, String name, double price) {
        this.fruitType = fruitType;
        this.name = name;
        this.price = price;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public void setFruitType(FruitType fruitType) {
        this.fruitType = fruitType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitType=" + fruitType +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
