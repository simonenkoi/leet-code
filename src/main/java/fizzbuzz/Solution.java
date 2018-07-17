package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder value;
        for (int i = 1; i <= n; ++i) {
            value = new StringBuilder();
            if (i % 3 == 0) {
                value.append("Fizz");
            }
            if (i % 5 == 0) {
                value.append("Buzz");
            }
            if (value.length() == 0) {
                value.append(i);
            }
            result.add(value.toString());
        }
        return result;
    }
}
