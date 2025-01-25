package untitled.src.main.java.org.example.modul3.homework.lesson8.ex2;

//import org.example.homework.lesson8.ex1.Employee;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//public class Test2 {
//
//    public static void main(String[] args) {
//        List<Integer> singletonAge = Collections.singletonList(18);
//        Set<String> singletonCountry = Collections.singleton("Uzbekistan");
//        Map<Integer, String> singletonHomeAddress = Collections.singletonMap(112, "Alisher Navoi");
//
//
//        Employee employee1 = new Employee(singletonAge, Set.of("USA"), Map.of(34, "Mirabad"), "Yusupova", "Diana");
//        print(employee1);
//        System.out.println("-----------------------------------------------------------");
//        Employee employee2 = new Employee(List.of(23), singletonCountry, Map.of(11, "Kashtanova"), "Morozova", "Liza");
//        print(employee2);
//        System.out.println("-----------------------------------------------------------");
//        Employee employee3 = new Employee(List.of(19), Set.of("India"), singletonHomeAddress, "Ptari", "Roksha");
//        print(employee3);
//
//    }
//
//    public static void print(Employee employee) {
//
//        System.out.println("Age: " + employee.getAge());
//        System.out.println("Name: " + employee.getName());
//        System.out.println("Last name: " + employee.getLastName());
//        System.out.println("Country: " + employee.getCountry());
//
//
//        System.out.print("Home address: " + employee.getHomeAddress());
//        Map<Integer, String> homeAddress = employee.getHomeAddress();
//        for (Integer key : homeAddress.keySet()) {
//            System.out.println(key + "/" + homeAddress.get(key));
//        }
//    }
//}
//
