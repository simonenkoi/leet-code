package validsquare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void testThatSquareIsCorrect() {
        int[] p1 = new int[]{0, 0};
        int[] p2 = new int[]{1, 1};
        int[] p3 = new int[]{1, 0};
        int[] p4 = new int[]{0, 1};
        boolean result = new Solution().validSquare(p1, p2, p3, p4);
        assertTrue(result);
    }

    @Test
    void testThatNotSquareIsIncorrect() {
        int[] p1 = new int[]{0, 0};
        int[] p2 = new int[]{1, 2};
        int[] p3 = new int[]{1, 0};
        int[] p4 = new int[]{0, 1};
        boolean result = new Solution().validSquare(p1, p2, p3, p4);
        assertFalse(result);
    }
}
