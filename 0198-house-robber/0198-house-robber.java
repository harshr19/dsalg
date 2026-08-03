class Solution {
    public int rob(int[] nums) {
        int[]dp = new int[nums.length + 1];
        for(int i =0; i < dp.length; i++) dp[i] = -1;
        return logic(nums, 0, dp);
    }
    private int logic(int[]nums, int i, int[]dp){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = nums[i] + logic(nums, i+2, dp);
        int notPick = logic(nums, i+1, dp);
        return dp[i] = Math.max(pick, notPick);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna