package validsquare;

import java.util.Arrays;

public class Solution {

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] points = {p1, p2, p3, p4};
        Arrays.sort(points, (l1, l2) -> l1[0] == l2[0] ? l1[1] - l2[1] : l1[0] - l2[0]);
        return isSquareValid(points);
    }

    private boolean isSquareValid(int[][] points) {
        return distance(points[0], points[1]) != 0
            && distance(points[0], points[1]) == distance(points[1], points[3])
            && distance(points[1], points[3]) == distance(points[3], points[2])
            && distance(points[3], points[2]) == distance(points[2], points[0])
            && distance(points[0], points[3]) == distance(points[1], points[2]);
    }

    private double distance(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow((double) p2[0] - p1[0], 2) + Math.pow((double) p2[1] - p1[1], 2));
    }
}
