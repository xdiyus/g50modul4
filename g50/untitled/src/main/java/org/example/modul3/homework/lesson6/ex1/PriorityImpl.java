package untitled.src.main.java.org.example.modul3.homework.lesson6.ex1;

import java.util.StringJoiner;

public class PriorityImpl<E> {
    private Object[] elements;
    private int size;

    public PriorityImpl(int count) {
        elements = new Object[count];
    }

    public PriorityImpl(Object[] elements, int size) {
        this.elements = elements;
        this.size = size;


    }

    public int size() {
        return size;
    }


    private boolean isFull() {
        return size == elements.length;
    }

    public void enqueue(E element, int priority) {
        if (isFull()) {
            throw new RuntimeException("Queue tolgan");
        }
        Tugun<E> newTugun = new Tugun<>(element, priority);
        elements[size++] = newTugun;
        sortirovkaQueue();

    }

    @SuppressWarnings("unchecked")
    public E dequeue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Notogri index kiritildi");
        }

        Tugun<E> tugun = (Tugun<E>) elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
        return tugun.getElement();
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        Tugun<E> tugun = (Tugun<E>) elements[0];
        return tugun.getElement();
    }


    @SuppressWarnings("unchecked")
    public void sortirovkaQueue() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {

                Tugun<E> current = (Tugun<E>) elements[j];
                Tugun<E> next = (Tugun<E>) elements[j + 1];
                if (current.getPriority() > next.getPriority()) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void swap(int i, int j) {
        Object temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static class Tugun<E> {
        private E element;
        private int priority;

        public Tugun(E element, int priority) {
            this.element = element;
            this.priority = priority;
        }

        public E getElement() {
            return element;
        }

        public int getPriority() {
            return priority;
        }
    }


    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (int i = 0; i < size; i++) {
            Tugun<E> tugun = (Tugun<E>) elements[i];
            stringJoiner.add("(" + tugun.element + ", priority: " + tugun.priority + ")");
        }
        return stringJoiner.toString();

    }

}
