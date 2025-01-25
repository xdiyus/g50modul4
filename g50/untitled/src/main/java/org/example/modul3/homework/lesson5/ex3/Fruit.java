package untitled.src.main.java.org.example.modul3.homework.lesson5.ex3;

public class Fruit {
    private String fruitName;
    private double price;

    public Fruit(String fruitName, double price) {
        this.fruitName = fruitName;
        this.price = price;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
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
                "fruitName='" + fruitName + '\'' +
                ", price=" + price +
                '}';
    }
}
