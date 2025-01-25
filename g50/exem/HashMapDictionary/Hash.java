package exem.HashMapDictionary;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class Hash<K, V> {
    private Object[] elements;
    private int size;


    public Hash(int capacity) {
        elements = new Object[capacity];
    }

    public Hash() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public V put(K key, V value) {

        int hash = key.hashCode();
        int index = hash % elements.length;


        Node node = (Node) elements[index];

        if (node == null) {
            elements[index] = new Node(key, value);
            size++;
            return null;

        }
        if (Objects.equals(node.key, key)) {
            V old = (V) node.value;
            node.value = value;
            return old;
        }
        Node current = node.next;
        Node prev = node;

        while (current != null) {
            if (Objects.equals(current.key, key)) {

                V old = (V) current.value;
                current.value = value;
                return old;
            }
            prev = prev.next;
            current = current.next;


        }
        prev.next = new Node(key, value);
        size++;
        return null;

    }

    @SuppressWarnings("unchecked")
    public V get(K key) {


        int hash = key.hashCode();
        int index = hash % elements.length;
        Node node = (Node) elements[index];
        if (node == null) {

            return null;
        }

        Node current = node;
        while (current != null) {
            if (Objects.equals(node.key, key)) {

                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @SuppressWarnings("uncheked")
    public V remove(K key) {


        int hash = key.hashCode();
        int index = hash % elements.length;


        Node node = (Node) elements[index];
        if (node == null) {
            return null;
        }
        if (Objects.equals(node.key, key)) {

            elements[index] = node.next;
            size--;
            return node.value;
        }
        Node current = node.next;
        Node prev = node;
        while (current != null) {
            if (Objects.equals(current.key, key)) {

                elements[index] = current.next;
                size--;
                return current.value;
            }


            prev = prev.next;
            current = current.next;
        }
        return null;
    }

    private class Node {

        K key;
        V value;
        Node next;


        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "{ ", " }");

        for (Object obc : elements) {
            Node node = (Node) obc;
            while (node != null) {
                stringJoiner.add(node.key + ":" + node.value);
                node = node.next;
            }

        }
        return stringJoiner.toString();
    }
}