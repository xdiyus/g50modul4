package untitled.src.main.java.org.example.modul3.repeat3modul.ex4;

import java.util.Objects;
import java.util.StringJoiner;

public class TestLink<E> {
    private int size;
    private Node head;
    private Node tail;


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public TestLink() {

    }


    public int size() {
        return size;
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
        return;
    }


    public E remove(E element) {
        if (Objects.isNull(head)) {
            return null;
        }

        if (Objects.equals(head.getElement(), element)) {
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
            size--;
            return element;
        }
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (Objects.equals(current.getElement(), element)) {
                if (current == tail) {
                    tail = prev;
                }
                if (prev != null) {
                    prev.setNext(current.getNext());
                }
                size--;
                return element;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    public class Node {


        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

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

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringJoiner stringJoiner = new StringJoiner(",", "[ ", " ]");
        Node node = head;
        while (node != null) {

            stringJoiner.add(String.valueOf(node.element));
            node = node.next;

        }
        return stringJoiner.toString();

    }
}
