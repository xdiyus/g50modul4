package exem.SingleLinkedList;

import javax.management.ObjectName;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class SingleList<E> {

    private Node head;
    private Node tail;
    private int size;


    public SingleList(int capacity) {

    }

    public SingleList() {
        this(10);
    }


    public int size() {
        return size;
    }


    public void add(E elementt) {
        if (isEmpty()) {
            head = new Node(elementt, null);
            tail = head;
            size++;
            return;

        }
        if (tail == null) {
            tail = new Node(elementt, null);
            head.next = tail;
            size++;
            return;
        }
        Node node = new Node(elementt, null);
        tail.next = node;
        tail = node;
        size++;
        return;

    }

    public E getElemett(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Error");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();

        }
        return current.getElement();
    }

    public void setElementt(E elementt, int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Error");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setElement(elementt);

    }


    public boolean isEmpty() {
        return size == 0;
    }

    public E remove(E element) {

        if (isEmpty()) {
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

        Node current = head.getNext();
        Node prev = head;

        while (current != null) {
            if (Objects.equals(current.getElement(), element)) {
                prev.setNext(current.getNext());
                size--;
                return element;


            }
            prev = current;
            current = current.getNext();

        }
        return null;
    }


    private class Node {
        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

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
    }

    @Override
    public String toString() {

        if (head == null) {
            return "[]";
        }
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        Node current = head;

        while (current != null) {

            stringJoiner.add(current.getElement().toString());
            current = current.next;
        }

        return stringJoiner.toString();
    }
}
