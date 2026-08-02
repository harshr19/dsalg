class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        java.util.Arrays.stream(dp).forEach(row -> java.util.Arrays.fill(row, -1));
        return logic(0,0, m ,n, dp);
    }
    private int logic(int a, int b, int m, int n, int[][]dp){
        if(a == m-1 && b == n-1)  return dp[a][b] = 1;
        if(a == m || b == n) return 0;
        if(dp[a][b] != -1)  return dp[a][b] ;
        int cnt1 = logic(a+1, b,m, n, dp);
        int cnt2 = logic(a, b+1,m , n, dp);
        return dp[a][b] =  cnt1 + cnt2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna