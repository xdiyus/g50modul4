package untitled.src.main.java.org.example.modul3.homework.lesson6.ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityImpl<String> priority = new PriorityImpl<>(5);

        System.out.println("Elemetlar: ");
        priority.enqueue("Diana", 5);
        priority.enqueue("Daniel", 2);
        priority.enqueue("David", 1);
        System.out.println(priority);
        System.out.println("--------------------------");

        System.out.println("Peek: " +  priority.peek());
        System.out.println(priority);
        System.out.println("--------------------------");

        System.out.println("Dequeue : ");
        System.out.println(priority.dequeue());
        System.out.println(priority);
        System.out.println("--------------------------");



        System.out.println("Size " + priority.size());
        System.out.println("--------------------------");
        System.out.println("Is empty?  " + priority.isEmpty());


    }

}
