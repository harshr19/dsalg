class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n ;
        int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE;
        int minInd = 0; int maxInd = 0;
        for(int idx = 0; idx < n; idx++){
            int elem = nums[idx];
            if(elem <= min){
                min = elem;
                minInd = idx;
            }
            if(elem >= max){
                max = elem;
                maxInd = idx;
            }
        }
        int left = Math.min(minInd, maxInd);
        int right = Math.max(minInd, maxInd);

        int leftCost = right + 1;
        int rightCost = n - left;
        int bothCost = (left + 1) + (n - right);

        return Math.min(leftCost, Math.min(rightCost, bothCost)); 
     
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna