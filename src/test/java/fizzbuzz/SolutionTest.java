package fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testThatFunctionWillReturnArrayWithCorrectSize() {
        int n = 15;
        List<String> result = Solution.fizzBuzz(n);
        assertEquals(n, result.size());
    }

    @Test
    void testThatFunctionWillReturnIndexStartsWith1IfNumberIsNotMultipleOfThreeOrFive() {
        int n = 15;
        List<String> result = Solution.fizzBuzz(n);
        assertEquals("1", result.get(0));
        assertEquals("2", result.get(1));
        assertEquals("4", result.get(3));
    }

    @Test
    void testThatFunctionWillReturnFizzIfNumberIsMultipleOfThreeAndNotMultipleOfFive() {
        int n = 15;
        List<String> result = Solution.fizzBuzz(n);
        assertEquals("Fizz", result.get(2));
        assertEquals("Fizz", result.get(5));
    }

    @Test
    void testThatFunctionWillReturnBuzzIfNumberIsMultipleOfFiveAndNotMultipleOfThree() {
        int n = 15;
        List<String> result = Solution.fizzBuzz(n);
        assertEquals("Buzz", result.get(4));
        assertEquals("Buzz", result.get(9));
    }

    @Test
    void testThatFunctionWillReturnFizzBuzzIfNumberIsMultipleOfThreeAndFive() {
        int n = 15;
        List<String> result = Solution.fizzBuzz(n);
        assertEquals("FizzBuzz", result.get(14));
    }
}