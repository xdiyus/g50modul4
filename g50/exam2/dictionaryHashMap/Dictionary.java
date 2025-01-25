package exam2.dictionaryHashMap;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class Dictionary<K, V> {
    private Object[] elements;
    private int size;


    public Dictionary(int capacity) {
        elements = new Object[capacity];
    }

    public Dictionary() {
        this(10);
    }

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

            V old = node.value;
            node.value = value;
            return old;

        }

        Node current = node.next;
        Node prev = node;

        while (current != null) {


            if (Objects.equals(current.key, key)) {

                V old = current.value;
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

    private class Node {
        K key;
        V value;
        Node next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public V get(K key) {
        int hash = key.hashCode();
        int index = hash % elements.length;

        Node node = (Node) elements[index];

        if (node == null) {
            return null;
        }


        Node current = node;

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                return (V) current.value;
            }
            current = current.next;
        }
        return null;
    }


    public V remove(K key){
        int hash = key.hashCode();
        int index = hash % elements.length;

        Node node = (Node) elements[index];


        if(node == null){
            return null;
        }
        if(Objects.equals(node.key,key)){

            elements[index ] = node.next;
            size--;
            return (V) node.value;

        }

        Node current = node.next;
        Node prev = node;

        while(current!= null){
            if(Objects.equals(current.key,key)){

                prev.next = current.next;
                size--;
                return (V) current.value;

            }
            prev = prev.next;
            current = current.next;

        }

        return null;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (Object element : elements) {
            Node node = (Node) element;
            while (node != null) {
                stringJoiner.add(node.value.toString());
                node = node.next;
            }
        }
        return stringJoiner.toString();
    }
}
