package ru.Geekbrains.sem_22_09_29_Iterator;

import java.util.Iterator;

public class CoolIterator implements Iterable<Integer> {

    private final int start;
    private final int end;

    public CoolIterator (int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int counter = start;
            @Override
            public boolean hasNext() {
                return counter <= end;
            }

            @Override
            public Integer next() {
                return counter++;
            }
        };
    }

}


