class Solution {
    public int getMaximumGold(int[][] grid) {
        int res = 0;
        int rowLen = grid.length;
        int colLen = grid[0].length;

        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {

                if (grid[row][col] == 0) continue;

                int gold = backtrack(grid, row, col, rowLen, colLen);
                res = Math.max(res, gold);
            }
        }

        return res;
    }

    private int backtrack(int[][] grid,
                          int row,
                          int col,
                          int rowLen,
                          int colLen) {

        if (row < 0 || col < 0 ||
            row >= rowLen || col >= colLen ||
            grid[row][col] == 0) {
            return 0;
        }

        int gold = grid[row][col];

        grid[row][col] = 0;

        int top = backtrack(grid, row - 1, col, rowLen, colLen);
        int bottom = backtrack(grid, row + 1, col, rowLen, colLen);
        int left = backtrack(grid, row, col - 1, rowLen, colLen);
        int right = backtrack(grid, row, col + 1, rowLen, colLen);

        grid[row][col] = gold;

        return gold + Math.max(
            Math.max(top, bottom),
            Math.max(left, right)
        );
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna