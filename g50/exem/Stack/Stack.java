package exem.Stack;

import java.util.StringJoiner;

public class Stack {
    private Object[] element;
    private int size;

    public Stack(int capacity) {
        element = new Object[capacity];
    }

    public Stack() {
        this(10);
    }



    public Object push(Object elementt) {
        if (isFull()) {
            throw new RuntimeException("Stack is full!");
        }

        return element[size++] = elementt;

    }

    public boolean isFull() {
        return size == element.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void pop() {

        if (isEmpty()) {

            throw new RuntimeException("Stack is empty");
        }
        element[--size] = element;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return element[size - 1];
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
