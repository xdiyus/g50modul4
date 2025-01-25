package untitled.src.main.java.org.example.modul3.homework.lesson8.ex1;

import java.util.*;

public class Test {

    public static void main(String[] args) {


        Map<Integer, String> emptyMap = Collections.emptyMap();
        List<Integer> emptyList = Collections.emptyList();
        Set<String> emptySet = Collections.emptySet();

        Employee employee1 = new Employee(List.of(18), Set.of("Ukraine"), emptyMap, "Yusupova", "Diana");
        print(employee1);
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");


        Employee employee2 = new Employee(List.of(32), emptySet, Map.of(23, "Yoshlar street"), "Teylor", "Tanya");
        print(employee2);
        System.out.println("-------------------------------------------------------------------------------");


        Employee employee3 = new Employee(emptyList, Set.of("USA"), Map.of(43, "Green Street"), "Kiko", "Lisa");
        print(employee3);
    }


    public static void print(Employee employee) {

        System.out.println("Name: " + (employee.getName().isEmpty() ? "No information " : employee.getName()));
        System.out.println("Last name : " + (employee.getLastName().isEmpty() ? "No information " : employee.getLastName()));
        System.out.println("Age : " + (employee.getAge().isEmpty() ? "No information " : employee.getAge()));
        System.out.println("Country : " + (employee.getCountry().isEmpty() ? "No information " : employee.getCountry()));
        System.out.print("Home address: ");


        Map<Integer, String> homeAddress = employee.getHomeAddress();
        for (Integer key : homeAddress.keySet()) {
            System.out.println(key + "/ " + homeAddress.get(key));
        }
    }
}


