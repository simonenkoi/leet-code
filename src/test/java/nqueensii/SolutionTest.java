package nqueensii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testFor4Queens() {
        int queensNumber = 4;
        int numberOfSolutions = new Solution().totalNQueens(queensNumber);
        assertEquals(2, numberOfSolutions);
    }

    @Test
    void testFor5Queens() {
        int queensNumber = 5;
        int numberOfSolutions = new Solution().totalNQueens(queensNumber);
        assertEquals(10, numberOfSolutions);
    }

    @Test
    void testFor6Queens() {
        int queensNumber = 6;
        int numberOfSolutions = new Solution().totalNQueens(queensNumber);
        assertEquals(4, numberOfSolutions);
    }

    @Test
    void testFor7Queens() {
        int queensNumber = 7;
        int numberOfSolutions = new Solution().totalNQueens(queensNumber);
        assertEquals(40, numberOfSolutions);
    }

    @Test
    void testFor8Queens() {
        int queensNumber = 8;
        int numberOfSolutions = new Solution().totalNQueens(queensNumber);
        assertEquals(92, numberOfSolutions);
    }

    @Test
    void testFor9Queens() {
        int queensNumber = 9;
        int numberOfSolutions = new Solution().totalNQueens(queensNumber);
        assertEquals(352, numberOfSolutions);
    }

    @Test
    void testFor10Queens() {
        int queensNumber = 10;
        int numberOfSolutions = new Solution().totalNQueens(queensNumber);
        assertEquals(724, numberOfSolutions);
    }
}
