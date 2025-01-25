package exam2.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(4);
        queue.enqueue(87);
        queue.enqueue(34);
        System.out.println(queue);
      queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.peek());


    }
}
