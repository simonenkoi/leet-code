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
        assertEquals(Integer.valueOf(1), peekingIterator.peek());
        assertEquals(Integer.valueOf(1), peekingIterator.next());
    }

    @Test
    public void testThatHasNextWillBeFalseAfterCallingNextForAllElements() {
        Iterator<Integer> iterator = Arrays.asList(2, 3).iterator();
        PeekingIterator peekingIterator = new PeekingIterator(iterator);
        assertEquals(Integer.valueOf(2), peekingIterator.next());
        assertEquals(Integer.valueOf(3), peekingIterator.next());
        assertFalse(peekingIterator.hasNext());
    }

    @Test
    public void testThatExceptionWillBeThrownInCaseOfCallingNextForNonexistentItem() {
        Iterator<Integer> iterator = Collections.singletonList(3).iterator();
        PeekingIterator peekingIterator = new PeekingIterator(iterator);
        assertEquals(Integer.valueOf(3), peekingIterator.next());
        assertThrows(NoSuchElementException.class, peekingIterator::next);
    }

    @Test
    public void testThatPeekWillReturnTheSameValueBeforeNextForOptional() {
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();
        PeekingIteratorWithOptional peekingIterator = new PeekingIteratorWithOptional(iterator);
        assertEquals(Integer.valueOf(1), peekingIterator.peek());
        assertEquals(Integer.valueOf(1), peekingIterator.next());
    }

    @Test
    public void testThatHasNextWillBeFalseAfterCallingNextForAllElementsForOptional() {
        Iterator<Integer> iterator = Arrays.asList(2, 3).iterator();
        PeekingIteratorWithOptional peekingIterator = new PeekingIteratorWithOptional(iterator);
        assertEquals(Integer.valueOf(2), peekingIterator.next());
        assertEquals(Integer.valueOf(3), peekingIterator.next());
        assertFalse(peekingIterator.hasNext());
    }

    @Test
    public void testThatExceptionWillBeThrownInCaseOfCallingNextForNonexistentItemForOptional() {
        Iterator<Integer> iterator = Collections.singletonList(3).iterator();
        PeekingIteratorWithOptional peekingIterator = new PeekingIteratorWithOptional(iterator);
        assertEquals(Integer.valueOf(3), peekingIterator.next());
        assertThrows(NoSuchElementException.class, peekingIterator::next);
    }
}