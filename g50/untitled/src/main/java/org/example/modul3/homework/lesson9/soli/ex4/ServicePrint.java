package untitled.src.main.java.org.example.modul3.homework.lesson9.soli.ex4;

//Принцип разделения интерфейса)
public class ServicePrint implements Printer,Scanner {
    @Override
    public void print(String text) {
        System.out.println("printing" + text);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scaner " + document);
    }
}
