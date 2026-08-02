class Solution {
        
        public int minPathSum(int[][] grid) {
        int m = grid.length;
        int  n = grid[0].length;
        int[][] dp = new int[m][n];
        java.util.Arrays.stream(dp).forEach(row -> java.util.Arrays.fill(row, -1));
        return logic(grid,0, 0, dp,m,n);
        
    }
   private int logic(int[][] grid, int a, int b, int[][] dp, int m, int n) {

    if (a == m - 1 && b == n - 1)
        return dp[a][b] = grid[a][b];

    if (a == m || b == n)
        return Integer.MAX_VALUE;

    if (dp[a][b] != -1)
        return dp[a][b];

    int down = logic(grid, a + 1, b, dp, m, n);
    int right = logic(grid, a, b + 1, dp, m, n);

    int cost1 = (down == Integer.MAX_VALUE) ? Integer.MAX_VALUE : grid[a][b] + down;
    int cost2 = (right == Integer.MAX_VALUE) ? Integer.MAX_VALUE : grid[a][b] + right;

    return dp[a][b] = Math.min(cost1, cost2);
}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna