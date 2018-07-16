package peekingiterator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class PeekingIteratorTest {
    @Test
    public void testThatPeekWillReturnTheSameValueBeforeNext() {
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();
        PeekingIterator peekingIterator = new PeekingIterator(iterator);
        assertEquals(peekingIterator.peek(), Integer.valueOf(1));
        assertEquals(peekingIterator.next(), Integer.valueOf(1));
    }

    @Test
    public void testThatHasNextWillBeFalseAfterCallingNextForAllElements() {
        Iterator<Integer> iterator = Arrays.asList(2, 3).iterator();
        PeekingIterator peekingIterator = new PeekingIterator(iterator);
        assertEquals(peekingIterator.next(), Integer.valueOf(2));
        assertEquals(peekingIterator.next(), Integer.valueOf(3));
        assertFalse(peekingIterator.hasNext());
    }

    @Test
    public void testThatExceptionWillBeThrownInCaseOfCallingNextForNonexistentItem() {
        Iterator<Integer> iterator = Collections.singletonList(3).iterator();
        PeekingIterator peekingIterator = new PeekingIterator(iterator);
        assertEquals(peekingIterator.next(), Integer.valueOf(3));
        assertThrows(NoSuchElementException.class, peekingIterator::next);
    }

    @Test
    public void testThatPeekWillReturnTheSameValueBeforeNextForOptional() {
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();
        PeekingIteratorWithOptional peekingIterator = new PeekingIteratorWithOptional(iterator);
        assertEquals(peekingIterator.peek(), Integer.valueOf(1));
        assertEquals(peekingIterator.next(), Integer.valueOf(1));
    }

    @Test
    public void testThatHasNextWillBeFalseAfterCallingNextForAllElementsForOptional() {
        Iterator<Integer> iterator = Arrays.asList(2, 3).iterator();
        PeekingIteratorWithOptional peekingIterator = new PeekingIteratorWithOptional(iterator);
        assertEquals(peekingIterator.next(), Integer.valueOf(2));
        assertEquals(peekingIterator.next(), Integer.valueOf(3));
        assertFalse(peekingIterator.hasNext());
    }

    @Test
    public void testThatExceptionWillBeThrownInCaseOfCallingNextForNonexistentItemForOptional() {
        Iterator<Integer> iterator = Collections.singletonList(3).iterator();
        PeekingIteratorWithOptional peekingIterator = new PeekingIteratorWithOptional(iterator);
        assertEquals(peekingIterator.next(), Integer.valueOf(3));
        assertThrows(NoSuchElementException.class, peekingIterator::next);
    }
}