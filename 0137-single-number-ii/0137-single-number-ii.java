class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for(int elem : nums){
            ones = (ones ^ elem) & ~twos;
            twos = (twos ^ elem) & ~ones;
        }
        return ones;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna