package nqueensii;

public class Solution {

    private int numberOfSolutions = 0;

    public int totalNQueens(int n) {
        Cell[] cells = new Cell[n];
        solveQueenProblem(n, 0, cells);
        return numberOfSolutions;
    }

    private void solveQueenProblem(int n, int row, Cell[] cells) {
        if (n == row) {
            numberOfSolutions++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isCellIsSafe(row, col, cells)) {
                cells[row] = new Cell(row, col);
                solveQueenProblem(n, row + 1, cells);
            }
        }
    }

    private boolean isCellIsSafe(int row, int col, Cell[] cells) {
        for (int queen = 0; queen < row; queen++) {
            if (cells[queen].getCol() == col
                || cells[queen].getRow() + cells[queen].getCol() == row + col
                || cells[queen].getRow() - cells[queen].getCol() == row - col) {
                return false;
            }
        }
        return true;
    }
}
