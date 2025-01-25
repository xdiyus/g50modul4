package untitled.src.main.java.org.example.modul3.homework.lesson9.soli.ex2;

public class Test {


    public static void main(String[] args) {
      Shape[] shapes = {new Circle(5), new Rectangle(4,6)};
      AreaCalculator calculator = new AreaCalculator();
        System.out.println("Natija: " + calculator.calculateTotalArea(shapes));
    }
}
