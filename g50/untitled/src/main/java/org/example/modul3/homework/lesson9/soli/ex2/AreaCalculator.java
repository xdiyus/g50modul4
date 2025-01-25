package untitled.src.main.java.org.example.modul3.homework.lesson9.soli.ex2;
// Open/Closed Principle (Принцип открытости/закрытости)
public class AreaCalculator {

    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
