package untitled.src.main.java.org.example.modul3.homework.lesson9.soli.ex2;
// Open/Closed Principle (Принцип открытости/закрытости)

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
