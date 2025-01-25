package untitled.src.main.java.org.example.modul3.homework.lesson4.ex1;

import java.util.Objects;
import java.util.StringJoiner;

public class MyList<E> {
    private Node head;
    private Node tail;
    private int size;

    public MyList() {
    }

    public void add(E element) {
        if (head == null) {
            head = new Node(element, null);
            size++;
            return;
        }

        if (tail == null) {
            tail = new Node(element, null);
            head.next = tail;
            size++;
            return;
        }
        Node node = new Node(element, null);
        tail.next = node;
        tail = node;
        size++;

    }

    public int size() {
        return size;
    }


    public E remove(E element) {

        if (Objects.isNull(head)) {
            return null;
        }

        if (Objects.isNull(tail) && !Objects.equals(head.getElement(), element)) {
            return null;
        }
        if (Objects.equals(head.getElement(), element)) {
            head = head.getNext();
            size--;
            return element;
        }


        Node newHead = head;
        Node prev = newHead;

        while (newHead != null) {
            if (Objects.equals(newHead.getElement(), element)) {
                prev.setNext(newHead.getNext());
                size--;
                return element;
            }
            prev = newHead;
            newHead = newHead.getNext();
        }

        return null;
    }


    public E getElementt(int index) {

        if (index < 0 || index >= size) {
            throw new RuntimeException("Index chegaradan chiqan!");
        }
        Node current = head;
        for (int i = 0; i < size; i++) {
            current = current.next;
        }

        return current.getElement();
    }

    public void setElementt(E elementt, int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Index chegaradan chiqan!");
        }

        Node current = head;
        for (int i = 0; i < size; i++) {
            current = current.getNext();

        }
        current.setElement(elementt);
    }

    public class Node {
        private E element;
        private Node next;

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }

        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");

        Node newHead = head;

        while (newHead != null) {
            stringJoiner.add(String.valueOf(newHead.element));
            newHead = newHead.next;
        }

        return stringJoiner.toString();
    }
}

