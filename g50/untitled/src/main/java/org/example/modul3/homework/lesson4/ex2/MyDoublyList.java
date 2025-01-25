package untitled.src.main.java.org.example.modul3.homework.lesson4.ex2;

import java.util.Objects;
import java.util.StringJoiner;

public class MyDoublyList<E> {
    private Node head;
    private Node tail;
    private int size;

    public void add(E element) {

        if (head == null) {
            head = new Node(element, null, null);
            tail = head;
        } else {
            Node newNode = new Node(element, null, tail);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(" Index topilmadi");
        }
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }


        } else if (index == size - 1) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        } else {
            Node newHead = head;
            for (int i = 0; i < index; i++) {
                newHead = newHead.next;
            }
            newHead.prev.next = newHead.next;

            if (newHead.next != null) {
                newHead.next.prev = newHead.prev;
            }///!!!!
        }
        size--;
    }

    public void remove(E element) {
        if (head == null) {
            return;
        }

        Node newHead = head;

        while (newHead != null) {
            if (Objects.equals(newHead.element, element)) {
                if (newHead.prev != null) {
                    newHead.prev.next = newHead.next;
                } else {
                    head = newHead.next;
                }
                if (newHead.next != null) {
                    newHead.next.prev = newHead.prev;
                } else {
                    tail = newHead.prev;
                }
                size--;
                return;
            }

        }
    }


    private class Node {
        private E element;
        private Node next;
        private Node prev;

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

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        Node newHead = head;

        while (newHead != null) {
            stringJoiner.add(String.valueOf(newHead.element));
            newHead = newHead.next;
        }
        return stringJoiner.toString();
    }
}

