class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int num : nums){
            if((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000) res++;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna