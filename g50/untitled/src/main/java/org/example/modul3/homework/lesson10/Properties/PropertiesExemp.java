package untitled.src.main.java.org.example.modul3.homework.lesson10.Properties;

import java.io.FileInputStream;
import java.io.IOException;

public class PropertiesExemp {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("C:/Users/usupo/IdeaProjects/untitled2/exem2/modul3/homework/lesson10/Properties/dianasprop.xml");
            java.util.Properties properties = new java.util.Properties();
            // properties.load(fileInputStream);
            properties.loadFromXML(fileInputStream);
            System.out.println(properties);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
