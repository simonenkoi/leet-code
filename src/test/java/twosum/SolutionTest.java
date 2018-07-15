package twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void checkThatCorrectArrayWillBeReturned() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void checkThatExceptionWillBeThrownIfSuitableValuesWillNotBeFound() {
        int[] nums = {2, 8, 11, 15};
        int target = 9;
        assertThrows(IllegalArgumentException.class, () -> Solution.twoSum(nums, target));
    }
}