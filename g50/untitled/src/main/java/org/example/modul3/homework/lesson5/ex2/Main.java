package untitled.src.main.java.org.example.modul3.homework.lesson5.ex2;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        TreeSet<Product> products1 = new TreeSet<>();
        products1.add(new Product("Apple", 10.0));
        products1.add(new Product("Peach", 5.0));
        products1.add(new Product("Cake", 16.0));
        products1.add(new Product("Soda", 85.0));
        products1.add(new Product("Orange", 41.0));
        products1.add(new Product("Water", 52.0));
        products1.add(new Product("Potato", 61.0));
        products1.add(new Product("Mango", 51.0));
        products1.add(new Product("Ice", 42.0));
        products1.add(new Product("Avocado", 5.0));
        products1.add(new Product("Chocolate", 72.0));
        products1.add(new Product("Ice cream", 56.0));
        products1.add(new Product("Kiwi", 33.0));
        products1.add(new Product("Chocolate Milk", 0));
        products1.add(new Product("Fresh juice", 54.0));
        products1.add(new Product("Egg", .0));
        products1.add(new Product("Cacao", 7.0));
        products1.add(new Product("Meal", 23.0));
        products1.add(new Product("Pomegranate", 8.0));
        products1.add(new Product("Melon", 5.0));

        System.out.println("Productlar listi:");
        for (Product product : products1) {
            System.out.println(product);
        }
    }
}
