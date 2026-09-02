class Solution {
    public int minOperations(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == 1) continue;

            int range = i + 2;
            if(nums[i] == 0 && range < nums.length){
                nums[i] = 1;
                nums[i+1] ^= 1;
                nums[i+2] ^= 1;
                ++res;
            }
           else if(range >= nums.length - 2 && nums[i] == 0) return -1;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna