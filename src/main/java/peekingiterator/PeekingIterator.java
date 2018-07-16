package peekingiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer nextValue;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        nextValue = getNextValue();
    }

    public Integer peek() {
        if (nextValue != null) {
            return nextValue;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public Integer next() {
        Integer currentNextValue = peek();
        nextValue = getNextValue();
        return currentNextValue;
    }

    @Override
    public boolean hasNext() {
        return nextValue != null;
    }

    private Integer getNextValue() {
        return iterator.hasNext() ? iterator.next() : null;
    }
}
