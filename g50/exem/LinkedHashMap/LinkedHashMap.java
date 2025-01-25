package exem.LinkedHashMap;

import java.util.Objects;


public class LinkedHashMap<K, V> {
    private int size;
    private Object[] elements;
    Connector head;
    Connector tail;


    public LinkedHashMap() {
        this(5);
    }

    public LinkedHashMap(int capacity) {
        elements = new Object[capacity];
    }


    private void addLinkedList(Connector newConnector) {
        if (head == null) {
            head = newConnector;
            tail = newConnector;
            return;
        }
        if (tail == null) {
            tail = newConnector;
            head.after = tail;
            tail.before = head;
        }
        tail.after = newConnector;
        newConnector.before = tail;
        tail = newConnector;

    }

    @SuppressWarnings("unchecked")
    public void put(K key, V value) {

        if (size == elements.length) {
            resize();
        }


        int hashCode = key.hashCode();
        int index = hashCode % elements.length;
        Connector connector = (Connector) elements[index];

        if (connector == null) {
            Connector newConnector = new Connector(null, null, key, value);
            elements[index] = newConnector;
            addLinkedList(newConnector);

        } else {
            if (Objects.equals(connector.key, key)) {
                connector.value = value;
                return;
            }

            Connector hozirgi = connector.next;
            Connector prev = connector;

            while (hozirgi != null) {
                if (Objects.equals(hozirgi.key, key)) {
                    hozirgi.value = value;
                    return;
                }
                hozirgi = hozirgi.next;
                prev = prev.next;
            }

            Connector newConnector = new Connector(null, null, key, value);
            prev.next = newConnector;

            addLinkedList(newConnector);
        }
        size++;


    }

    public V get(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % elements.length;
        Connector connector = (Connector) elements[index];

        while (connector != null) {
            if (Objects.equals(connector.key, key)) {
                return connector.value;
            }
            connector = connector.next;
        }
        return null;
    }


    public V remove(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % elements.length;
        Connector prev = null;
        Connector connector = (Connector) elements[index];
        V removeValue = connector.value;

        while (connector != null) {
            if (Objects.equals(connector.key, key)) {
                if (prev == null) {
                    elements[index] = connector.next;
                }
                if (connector.before != null) {
                    connector.before.after = connector.after;
                } else {
                    head = connector.after;
                }
                if (connector.after != null) {
                    connector.after.before = connector.before;
                } else {
                    tail = connector.before;
                }
                size--;
                return removeValue;
            }

            prev = connector;
            connector = connector.next;

        }
        return null;
    }


    public void resize() {
        int newCapacity = elements.length * 2;
        Object[] newConnectors = new Object[newCapacity];
        Connector connector = head;
        head = null;
        tail = null;
        while (connector != null) {
            int hashcode = connector.key.hashCode();
            int index = hashcode % newCapacity;
            if (newConnectors[index] == null) {
                newConnectors[index] = connector;
            } else {
                Connector current = connector;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = connector;
            }
            addLinkedList(connector);
            connector = connector.after;
        }
        elements = newConnectors;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{ ");
        Connector hozirgi = head;

        while (hozirgi != null) {
            stringBuilder.append(hozirgi.key).append(" : ").append(hozirgi.value);
            hozirgi = hozirgi.after;

            if (hozirgi != null) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public int size() {
        return size;
    }


    public class Connector {
        K key;
        V value;
        Connector next;
        Connector before;
        Connector after;

        public Connector(Connector after, Connector before, K key, V value) {
            this.after = after;
            this.before = before;
            this.key = key;

            this.value = value;
        }
    }

}


