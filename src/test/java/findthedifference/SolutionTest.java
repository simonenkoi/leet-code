package findthedifference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        String baseString = "abcd";
        String resultString = "abcde";
        char diff = new Solution().findTheDifference(baseString, resultString);
        assertEquals('e', diff);
    }

    @Test
    void test2() {
        String baseString = "abcd";
        String resultString = "abced";
        char diff = new Solution().findTheDifference(baseString, resultString);
        assertEquals('e', diff);
    }

    @Test
    void test3() {
        String baseString = "abcd";
        String resultString = "aecdb";
        char diff = new Solution().findTheDifference(baseString, resultString);
        assertEquals('e', diff);
    }

    @Test
    void test4() {
        String baseString = "abcd";
        String resultString = "abdec";
        char diff = new Solution().findTheDifference(baseString, resultString);
        assertEquals('e', diff);
    }

    @Test
    void test5() {
        String baseString = "abcd";
        String resultString = "aecdb";
        char diff = new Solution().findTheDifference(baseString, resultString);
        assertEquals('e', diff);
    }

    @Test
    void test6() {
        String baseString = "a";
        String resultString = "aa";
        char diff = new Solution().findTheDifference(baseString, resultString);
        assertEquals('a', diff);
    }
}
