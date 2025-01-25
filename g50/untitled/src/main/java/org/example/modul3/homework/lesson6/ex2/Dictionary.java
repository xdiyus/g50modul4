package untitled.src.main.java.org.example.modul3.homework.lesson6.ex2;

import java.util.Objects;

public class Dictionary<K, V> {

    public Object[] connectors;
    public int size;

    public Dictionary() {
        this(10);
    }

    public Dictionary(int capacity) {
        connectors = new Object[capacity];
    }


    @SuppressWarnings("unchecked")
    public void put(K key, V value) {

        if (size >= connectors.length) {
            resize();
        }
        int hashCode = key.hashCode();
        int index = hashCode % connectors.length;

        Connector connector = (Connector) connectors[index];

        if (connector == null) {
            connectors[index] = new Connector(key, value);
        } else {
            if (Objects.equals(connector.key, key)) {
                connector.value = value;
                return;
            }

            Connector next = connector.next;
            Connector prev = connector;

            while (next != null) {
                if (Objects.equals(next.key, key)) {
                    next.value = value;
                    return;
                }
                next = next.next;
                prev = prev.next;
            }
            prev.next = new Connector(key, value);
        }
        size++;

    }

    @SuppressWarnings("unchecked")
    public void remove(K key) {

        int hashCode = key.hashCode();
        int index = hashCode % connectors.length;
        Connector prev = null;
        Connector connector = (Connector) connectors[index];
        while (connector != null) {
            if ((Objects.equals(connector.key, key))) {
                if (prev == null) {
                    connectors[index] = connector.next;
                } else {

                    prev.next = connector.next;
                }

                return;
            }
            connector = connector.next;
            prev = prev.next;


        }


    }

    @SuppressWarnings("unchecked")
    public void resize() {

        int newsize = connectors.length * 2;
        Object[] newConnector = new Objects[newsize];

        for (int i = 0; i < connectors.length; i++) {
            Connector connector = (Connector) connectors[i];
            while (connector != null) {
                int newIndex = connector.key.hashCode() % newsize;

                Connector keyingi = connector.next;
                connector.next = (Connector) newConnector[newIndex];
                newConnector[newIndex] = connector;

                connector = keyingi;
            }


        }
        connectors = newConnector;

    }

    @SuppressWarnings("unchecked")
    public V get(K key) {

        int hashCode = key.hashCode();
        int index = hashCode % connectors.length;

        Connector connector = (Connector) connectors[index];
        if (Objects.isNull(connector)) {
            return null;
        }
        if (Objects.equals(connector.key, key)) {
            return connector.value;
        }

        Connector conect = connector;
        while (conect != null) {
            if (Objects.equals(conect.key, key)) {
                return conect.value;
            }
            conect = conect.next;
        }
        return null;
    }


    public class Connector {
        K key;
        V value;
        Connector next;

        public Connector(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < connectors.length; i++) {
            Connector connector = (Connector) connectors[i];
            if (Objects.isNull(connector)) {
                continue;
            }
            stringBuilder.append(connector.key).append(" : ").append(connector.value).append(", ");
            Connector next = connector.next;
            while (next != null) {
                stringBuilder.append(next.key).append(" :").append(next.value).append(",");
                next = next.next;
            }
            ///if qoshish kere

        }
        return stringBuilder.append(" }").toString();
    }

}