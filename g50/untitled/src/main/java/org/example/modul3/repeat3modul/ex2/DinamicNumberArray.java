package untitled.src.main.java.org.example.modul3.repeat3modul.ex2;

import java.util.Arrays;

public class DinamicNumberArray<T extends Number> {
    private Object[] elements;
    private int size;

    public DinamicNumberArray() {
        this(10);
    }

    public DinamicNumberArray(int capacity) {
        elements = new Object[capacity];
    }

    public void add(Object element) {

        if (size == elements.length) {
            Object[] newArr = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArr, 0, elements.length);
            elements = newArr;

        }
        elements[--size] = element;
    }

    public void remove(int index){
        if(size <index || index <0){
            throw new ElementNotFoundException("Element sizedan chiqib ketkan ");

        }
        for (int i = index; i < elements.length; i++) {
           elements[index ] = elements[index+1];
        }
        elements[--size] = null;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        if(size <index || index <0){
            throw new ElementNotFoundException("Element sizedan chiqib ketkan ");
        }
        return (T) elements[index];

    }

    @Override
    public String toString() {
        return "DinamicNumberArray{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
