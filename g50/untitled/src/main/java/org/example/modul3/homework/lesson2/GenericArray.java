package untitled.src.main.java.org.example.modul3.homework.lesson2;

import java.util.Arrays;

public class GenericArray<T> {

    private Object[] array;
    private int size;

    public GenericArray() {
        this(10);
    }

    public GenericArray(int capacity) {
        if (capacity < 10) {
            capacity = 10;
        }
        array = new Object[capacity];

    }

    public void add(T value) {

        if (size == array.length) {
            Object[] newElements = new Object[array.length * 2];
            System.arraycopy(array, 0, newElements, 0, array.length);
            array = newElements;
        }
        array[size++] = value;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ElementNotFoundException("Индекс вышел за пределы");
        }
        return (T) array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ElementNotFoundException("Индекс вышел за пределы");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];

        }
        array[--size] = null;
    }

    @Override
    public String toString() {
        return "GenericArray{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}


