package untitled.src.main.java.org.example.modul3.repeat3modul.ex3.fruits;

public class Fruits {


    private  String name;
    private double price;
    private FruitsEnum fruitsEnum;

    public Fruits(FruitsEnum fruitsEnum, String name, double price) {
        this.fruitsEnum = fruitsEnum;
        this.name = name;
        this.price = price;
    }


    public FruitsEnum getFruitsEnum() {
        return fruitsEnum;
    }

    public void setFruitsEnum(FruitsEnum fruitsEnum) {
        this.fruitsEnum = fruitsEnum;
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
        return "Fruits{" +
                "fruitsEnum=" + fruitsEnum +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
