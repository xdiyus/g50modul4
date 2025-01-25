package untitled.src.main.java.org.example.modul3.homework.lesson10.ResourceBundles;


import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ResourceBundlee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tilni tanlang(uz, Choose language(en), ");
        String language = scanner.nextLine();

        Locale locale = Locale.forLanguageTag(language);

        ResourceBundle messages = ResourceBundle.getBundle("messages", locale);

        String hi = messages.getString("hi");

    }
}



