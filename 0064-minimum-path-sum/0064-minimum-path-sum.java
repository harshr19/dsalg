class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        int totalCost = 0;
        for(int i = 0; i < n; i++){
            totalCost += grid[0][i];
            dp[0][i] = totalCost;
        }
        totalCost = 0;
        for(int i = 0; i < m; i++){
            totalCost += grid[i][0];
            dp[i][0] = totalCost;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                int cost1 = grid[i][j] + dp[i-1][j];
                int cost2 = grid[i][j] + dp[i][j-1];
                dp[i][j] = Math.min(cost1, cost2);
            }
        }
        return dp[m-1][n-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna