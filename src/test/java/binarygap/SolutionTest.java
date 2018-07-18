package binarygap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testThatFunctionWillReturnCorrectResultFor22() {
        int input = 22;
        int output = new Solution().binaryGap(input);
        assertEquals(2, output);
    }

    @Test
    void testThatFunctionWillReturnCorrectResultFor5() {
        int input = 5;
        int output = new Solution().binaryGap(input);
        assertEquals(2, output);
    }

    @Test
    void testThatFunctionWillReturnCorrectResultFor6() {
        int input = 6;
        int output = new Solution().binaryGap(input);
        assertEquals(1, output);
    }

    @Test
    void testThatFunctionWillReturnCorrectResultFor8() {
        int input = 8;
        int output = new Solution().binaryGap(input);
        assertEquals(0, output);
    }
}
