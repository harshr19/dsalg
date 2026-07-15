class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] hash = new int[101];
        for(int i = 0; i < nums.length; i++){
            hash[nums[i]]++;
        }
        int res = 0;
        for(int i = 0 ; i < hash.length; i++){
            int n = hash[i];
            res += (n * (n-1) )/ 2;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna