package exam2.queue;

import java.util.Arrays;
import java.util.StringJoiner;

public class Queue<E> {
    private Object[] elements;
    private int size;

    public Queue(int capacity) {
        elements = new Object[capacity];
    }

    public Queue() {
        this(10);
    }
    ///que,deque,peek


    public boolean isFull() {
        return size == elements.length;
    }

    public void enqueue(E element) {
        if (isFull()) {
            throw new RuntimeException("Is full");
        }
        elements[size++] = element;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E dequeue() {

        if (isEmpty()) {
            throw new RuntimeException("Is empty");
        }
        E element = (E)elements;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return element;
    }

    public E peek(){
        if (isEmpty()) {
            throw new RuntimeException("Is empty");
        }
       return  (E)elements[0];
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (int i = 0; i < size; i++) {
            stringJoiner.add(elements[i].toString());

        }
        return stringJoiner.toString();
    }
    }

