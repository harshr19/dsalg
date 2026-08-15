class Solution {
    public int longestSubsequence(int[] nums) {
        boolean allZero = true;
        int totalXOR = 0;
        for(int i : nums){
            totalXOR ^= i;
            if(i > 0) allZero = false;
        }
        if(totalXOR > 0) return nums.length;
        return allZero ? 0 : nums.length - 1;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna