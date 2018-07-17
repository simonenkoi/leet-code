package fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testThatFunctionWillReturnArrayWithCorrectSize() {
        int n = 15;
        List<String> result = Solution.fizzBuzz(n);
        assertEquals(result.size(), n);
    }

    @Test
    void testThatFunctionWillReturnIndexStartsWith1IfNumberIsNotMultipleOfThreeOrFive() {
        int n = 15;
        List<String> result = Solution.fizzBuzz(n);
        assertEquals(result.get(0), "1");
        assertEquals(result.get(1), "2");
        assertEquals(result.get(3), "4");
    }

    @Test
    void testThatFunctionWillReturnFizzIfNumberIsMultipleOfThreeAndNotMultipleOfFive() {
        int n = 15;
        List<String> result = Solution.fizzBuzz(n);
        assertEquals(result.get(2), "Fizz");
        assertEquals(result.get(5), "Fizz");
    }

    @Test
    void testThatFunctionWillReturnBuzzIfNumberIsMultipleOfFiveAndNotMultipleOfThree() {
        int n = 15;
        List<String> result = Solution.fizzBuzz(n);
        assertEquals(result.get(4), "Buzz");
        assertEquals(result.get(9), "Buzz");
    }

    @Test
    void testThatFunctionWillReturnFizzBuzzIfNumberIsMultipleOfThreeAndFive() {
        int n = 15;
        List<String> result = Solution.fizzBuzz(n);
        assertEquals(result.get(14), "FizzBuzz");
    }
}