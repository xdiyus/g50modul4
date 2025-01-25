//package exam2.list;
//
//import java.util.Arrays;
//import java.util.StringJoiner;
//
//public class ArrayList<E> {
//    private Object[] elements;
//    private int size;
//
//    public ArrayList(int capacity) {
//        if (capacity > 10) {
//            capacity = 10;
//        }
//        elements = new Object[capacity];
//    }
//
//    public ArrayList() {
//        this(10);
//    }
//
//    public void add(E element) {
//        if (size == elements.length) {
//            Object[] newArr = new Object[elements.length * 2];
//            System.arraycopy(elements, 0, newArr, 0, elements.length);
//            elements = newArr;
//        }
//        elements[size++] = element;
//    }
//
//    public boolean isEmpty() {
//        return size == elements.length;
//    }
//
//    @SuppressWarnings("unchecked")
//    public E get(int index) {
//
//        if (isEmpty()) {
//            throw new RuntimeException("Array is empty!");
//        }
//        return (E) elements[index];
//    }
//
//public void remove(int index){
//        if(index >= size || index<0){
//            throw new RuntimeException("Yoq");
//        }
//
//        elements[size--] = index;
//}
//
//
//    @Override
//    public String toString() {
//        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
//        for (int i = 0; i < size; i++) {
//            stringJoiner.add(elements[i].toString());
//        }
//        return stringJoiner.toString();
//    }
//}
//
