package untitled.src.main.java.org.example.modul3.repeat3modul.ex8.ex1;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {


    public static void main(String[] args) {
        List<Integer> age = Collections.emptyList();
        Set<String> profession = Collections.emptySet();
        Map<Integer, String> address = Collections.emptyMap();


        Employee1 employee1 = new Employee1(Map.of(23 ,"bekat"),age,"Jazratova","Barno",Set.of("HR"));

        System.out.println(employee1);

        System.out.println("-------------------------");
        Employee1 employee2 = new Employee1(Map.of(23 ,"bekat"),age,"Jazratova","Barno",Set.of("HR"));
        System.out.println(employee2);
    }
}
