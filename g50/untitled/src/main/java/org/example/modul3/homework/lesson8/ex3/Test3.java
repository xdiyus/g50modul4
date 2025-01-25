package untitled.src.main.java.org.example.modul3.homework.lesson8.ex3;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test3 {


    public static void main(String[] args) {


        Employee3 employee1 = new Employee3(
                "Diana",
                Map.of(41, "Novza", 20, "Sampi Business Centre", 32, "Oybek"),
                "Muradovna",
                Set.of("Ukraine", "USA", "Dubai"),
                List.of(2, 5, 3));
        print(employee1);
        System.out.println("----------------------------------------------------------");
        Employee3 employee2 = new Employee3(
                "Sofia",
                Map.of(2, "Pahtakor", 51, "Business Centree Ceramic", 19, "Alpomish"),
                "Tom",
                Set.of("India", "Tailand", "Africa"),
                List.of(5, 10, 6));
        print(employee2);

    }

    public static void print(Employee3 employee3) {
        System.out.println("First name: " + employee3.getFirstName());
        System.out.println("Surname: " + employee3.getSurname());
        System.out.println("Years Of Experience: " + employee3.getYearsOfExperience());
        System.out.println("Visited Countries: " + employee3.getVisitedCountries());

        System.out.print("Office location: " + employee3.getOfficeLocations());

        Map<Integer, String> officeLocations = employee3.getOfficeLocations();
        for (Integer key : officeLocations.keySet()) {
            System.out.println(key + "/" + officeLocations.get(key));
        }

    }
}
