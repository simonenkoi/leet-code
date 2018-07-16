package peekingiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;

public class PeekingIteratorWithOptional implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Optional<Integer> nextValue;

    public PeekingIteratorWithOptional(Iterator<Integer> iterator) {
        this.iterator = iterator;
        nextValue = getNextValue();
    }

    public Integer peek() {
        return nextValue.orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Integer next() {
        Integer currentNextValue = peek();
        nextValue = getNextValue();
        return currentNextValue;
    }

    @Override
    public boolean hasNext() {
        return nextValue.isPresent();
    }

    private Optional<Integer> getNextValue() {
        return iterator.hasNext() ? Optional.of(iterator.next()) : Optional.empty();
    }
}
