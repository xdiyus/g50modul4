package untitled.src.main.java.org.example.modul3.homework.lesson5.ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        userList.add(new User(18, "Diana", "Yusupova"));
        userList.add(new User(18, "Diana", "Yusupova"));
        userList.add(new User(20, "Aziza", "Qodirova"));
        userList.add(new User(17, "David", "Yusupov"));
        userList.add(new User(45, "Xadicha", "Maxmudova"));
        userList.add(new User(32, "Tom", "Wet"));
        userList.add(new User(18, "Lola", "Yusuf"));
        userList.add(new User(18, "Guli", "Ravsh"));
        userList.add(new User(18, "Diana", "Yusupova"));
        userList.add(new User(18, "Diana", "Yusupova"));

        System.out.println("Dublicatlari bilan ");
        for (User user : userList) {
            System.out.println(user);
        }

        System.out.println("Dublicatsiz");
        Set<User> users = new HashSet<>(userList);
        for (User user : users) {
            System.out.println(user);
        }
    }
}

