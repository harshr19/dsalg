class Solution {

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int x : nums) sum += x;

        if (sum % 2 != 0) return false;

        sum /= 2;

        Boolean[][] dp = new Boolean[nums.length][sum + 1];

        return solve(nums, 0, sum, dp);
    }

    private boolean solve(int[] nums, int idx, int target, Boolean[][] dp) {

        if (target == 0) return true;

        if (idx >= nums.length || target < 0)
            return false;

        if (dp[idx][target] != null)
            return dp[idx][target];

        boolean pick = solve(nums, idx + 1, target - nums[idx], dp);

        boolean notPick = solve(nums, idx + 1, target, dp);

        return dp[idx][target] = pick || notPick;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna