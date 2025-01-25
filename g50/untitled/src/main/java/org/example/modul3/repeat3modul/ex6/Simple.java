package untitled.src.main.java.org.example.modul3.repeat3modul.ex6;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class Simple<E> {
    private Object[] elements;
    private int size;


    private Simple() {
        this(10);
    }

    Simple(int capacity) {
        elements = new Object[capacity];
    }



    public int size() {
        return size;
    }

    public void enqueu(E element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full!");
        }
        elements[size++] = element;

    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Is Empty");
        }
        return (E) elements[0];


    }

    @SuppressWarnings("unchecked")
    public E deque() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is full!");
        }
        E element = (E) elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i+1];

        }
        size--;
        return element;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public boolean isEmpty() {
        return size == 0;
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
