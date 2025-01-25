package exem.Stack;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("DII");
        stack.push("ADI");
        stack.push("FIA");
        stack.push("HHH");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());


    }
}
