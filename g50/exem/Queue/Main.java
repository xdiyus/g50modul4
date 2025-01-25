package exem.Queue;

public class Main {


    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("Diana");
        queue.enqueue("SAA");
        queue.enqueue("DGG");
        queue.enqueue("HII");
        System.out.println(queue);

        queue.deque();

        System.out.println(queue);
    }

}
