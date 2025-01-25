package untitled.src.main.java.org.example.modul3.homework.lesson10.Stack;

public class TestStack {


    public static void main(String[] args) {


        Stack stack = new Stack();

        stack.push("Diana");
        stack.push("Sar");
        stack.push("Ruh");
        stack.push("Jiji");
        System.out.println(stack);


        System.out.println("Pop: " + stack.pop());
        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println(stack);
    }
}
