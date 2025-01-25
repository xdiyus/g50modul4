package untitled.src.main.java.org.example.modul3.repeat3modul.ex2;

import java.util.Arrays;

public class Generic<T> {
    private Object[] array;
    int size;

    public Generic(int capascity) {
        array = new Object[capascity];
    }

    public Generic() {
        this(10);
    }

    public void add(Object element) {

        if (size == array.length) {
            Object[] newArr = new Object[array.length * 2];
            System.arraycopy(array, 0, newArr, 0, array.length);
            array = newArr;
        }
        array[size++] = element;

    }

    public T get(int index) {
        if (size < index || index < 0) {
            throw new ElementNotFoundException("Sizedan chiqib ketkan!");
        }
        return (T) array[index];
    }

    public void remove(int index) {
        if (size < index || index < 0) {
            throw new ElementNotFoundException("Sizedan chiqib ketkan!");
        }
        for (int i = index; i < array.length-1; i++) {
          array[index] = array[index+1];
        }
        array[--size] = null;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
