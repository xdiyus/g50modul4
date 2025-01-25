package exem.Queue;

import java.util.Arrays;
import java.util.StringJoiner;

public class Queue<E> {
    private Object[] element;
    private int size;


    public Queue(int capacity) {
        element = new Object[capacity];//dequ, eque peek size
    }

    public Queue() {
        this(10);
    }

    public void enqueue(E elementt) {
        if (isFull()) {
            throw new RuntimeException("Queue is full!");
        }

        element[size++] = elementt;
    }

    public boolean isFull() {
        return size == element.length;
    }

    @SuppressWarnings("unchecked")
    public E deque() {
        if (isEmpty()) {
            throw new RuntimeException("Is empty");
        }
        E elem = (E) element;
        for (int i = 0; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        size--;
        return elem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public E peek() {

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        return (E) element[0];
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (int i = 0; i < size; i++) {
            stringJoiner.add(element[i].toString());

        }
        return stringJoiner.toString();
    }
}
