class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = 0; int maxElem = nums[0] - 1;
        for(int i = 1; i < nums.length; i++){
            maxProd = Math.max((nums[i]-1) * maxElem, maxProd);
            maxElem = Math.max(maxElem, nums[i]-1);
        }
        return maxProd;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna