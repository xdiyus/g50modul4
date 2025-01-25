package exem.ArrayList;

import java.util.Arrays;
import java.util.StringJoiner;

public class Dynamic<E> {
    private Object[] elements;
    private int size;

    public Dynamic(int capacity) {

        if (capacity > 10) {
            capacity = 10;
        }
        elements = new Object[capacity];
    }

    public Dynamic() {
        this(10);
    }


    public void add(E element) {

        if (size == elements.length) {
            Object[] newArr = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArr, 0, elements.length);
            elements = newArr;

        }

        elements[size++] = element;

    }


    public E get(int index) {

        if (index < 0 || size < index) {
            throw new RuntimeException("Error");
        }
        return (E) elements[index];
    }

    public void remove(int index) {

        if (index < 0 || size < index) {
            throw new RuntimeException("Error");
        }

        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];

        }
        elements[--size] = null;
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




