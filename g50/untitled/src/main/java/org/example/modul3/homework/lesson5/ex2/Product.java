package untitled.src.main.java.org.example.modul3.homework.lesson5.ex2;

public class Product implements Comparable<Product> {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo(Product o) {

        return Double.compare(o.getPrice(), this.getPrice());
    }
}






