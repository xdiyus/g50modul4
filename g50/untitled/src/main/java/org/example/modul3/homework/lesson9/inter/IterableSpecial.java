package untitled.src.main.java.org.example.modul3.homework.lesson9.inter;

import java.util.Iterator;

public class IterableSpecial implements Iterable<Integer> {
    private int start;
    private int end;

    public IterableSpecial(int start, int end) {

        this.end = end;
        this.start = start;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new IteratorSpecial(start, end);
    }
}

class IteratorSpecial implements Iterator<Integer> {
    private int end;
    private int current;

    public IteratorSpecial(int current, int end) {
        this.current = current;
        this.end = end;
    }

    @Override
    public boolean hasNext() {
        while (current <= end) {
            if (current % 3 == 0 && current % 5 == 0) {
                return true;
            }
            current++;
        }
        return false;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new IllegalStateException("Больше нет чисел, которые делятся на 3 и 5.");
        }
        return current++;
    }
}

