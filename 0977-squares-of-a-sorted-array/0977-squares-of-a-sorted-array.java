class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0; int right = n - 1;
        int i = 1;
        int[] res = new int[n];
        while(left <= right){
            int l = Math.abs(nums[left]);
            int r = Math.abs(nums[right]);
            if(l < r){
                res[n-i] = nums[right] * nums[right];
                i++; right--;
            }
            else{
                res[n-i] = nums[left] * nums[left];
                i++; left++;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna