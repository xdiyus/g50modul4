package untitled.src.main.java.org.example.modul3.homework.lesson10.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Stack {

    private Object[] elements;// push , pop, peek
    private int size;


    public Stack() {
        this(10);
    }

    public Stack(int capacity) {

        elements = new Object[capacity];
    }


    public boolean isFull() {
        return size == elements.length;
    }

    public void push(Object element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        elements[size++] = element;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public Object pop() {


        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[--size];
    }


    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return elements[size - 1];

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
