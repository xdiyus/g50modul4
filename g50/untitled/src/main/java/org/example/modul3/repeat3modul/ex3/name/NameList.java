package untitled.src.main.java.org.example.modul3.repeat3modul.ex3.name;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameList {


    private List<String> names;
    private int size;

    public NameList() {
        this.names = new ArrayList<>();
        this.size = 0;
    }


    public void remove() {

        List<String> newElement = new ArrayList<>();

        for (String name : names) {
            if (!newElement.contains(name)) {
                newElement.add(name);
            }
            names = newElement;
            size = newElement.size();

        }
    }

    public void add(String name) {
        names.add(name);
        size++;

    }


    public void print() {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(true);
        }


    }

    @Override
    public String toString() {
        return "NameList{" +
                "names=" + names +
                ", size=" + size +
                '}';
    }
}

