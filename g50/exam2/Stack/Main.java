package exam2.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Diana");
        stack.push("daniel");
        stack.push("David");
        stack.push("Murad");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
