class Solution {
    public int climbStairs(int n) {
        int[]dp = new int[n+1];
        for(int i= 0; i< dp.length ; i++)
            dp[i] = -1;
        return logic(n, 0, dp);
    }
    private int logic(int n, int i, int[]dp){
        if(i > n) return 0;
        if(i == n) return dp[i]= 1;
        if(dp[i] != -1) return dp[i];
        int path1 = logic(n, i+1, dp);
        int path2 = logic(n, i+2, dp);
        return dp[i]= path1 + path2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna