package binarygap;

public class Solution {

    public int binaryGap(int n) {
        int longestDistance = 0;
        int indexOfStart = -1;
        for (int i = 0; n != 0; ++i) {
            int bit = n % 2;
            if (bit == 1) {
                if (indexOfStart != -1 && indexOfStart != i) {
                    longestDistance = Math.max(i - indexOfStart, longestDistance);
                }
                indexOfStart = i;
            }
            n /= 2;
        }
        return longestDistance;
    }
}
