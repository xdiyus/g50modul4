package exam2.Stack;

import java.util.StringJoiner;

public class Stack {
    ///push,pop,peek
    private Object[] elements;
    private int size;

    public Stack(int capacity) {
        elements = new Object[capacity];
    }

    public Stack() {
        this(10);
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public Object push(Object element) {

        if (isFull()) {
            throw new RuntimeException("Stack is full!");
        }
        return elements[size++] = element;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return elements[--size];

    }

    public Object peek(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return elements[size--];

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
