class Solution {
    public boolean canPlaceFlowers(int[] nums, int k) {
       
        int n = nums.length;
        if(k == 0) return true;
        if(n >= 2 && nums[0] == 0 && nums[1] == 0){
            nums[0] = 1;
            k--;
            if(k == 0) return true;
        }

        if(n == 1){
            if(nums[0] == 0 && (k == 0 || k == 1)) return true;
            else return false;
        }

        for(int i = 1; i < n - 1; i++){
            
            if(nums[i] == 0 && nums[i-1] == 0 && nums[i+1] == 0){
                nums[i] = 1;
                k--;
                if(k == 0) return true;
            }

        }
        if(nums[n-2] == 0 && nums[n-1] == 0 && k > 0){
            nums[n-1] = 1;
            k--;
        }
        return k == 0;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna