class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int i = 0; i < k / 2; i++) {
            int topRow = x + i;
            int bottomRow = x + (k - 1 - i);
            for (int col = 0; col < k; col++) {
                int temp = grid[topRow][y + col];
                grid[topRow][y + col] = grid[bottomRow][y + col];
                grid[bottomRow][y + col] = temp;
            }
        }
        return grid;
    }
}