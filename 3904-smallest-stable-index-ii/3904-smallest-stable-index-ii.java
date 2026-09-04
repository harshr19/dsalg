class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] stabilityScores = new int[n];
        int minElem = Integer.MAX_VALUE;
        int maxElem = Integer.MIN_VALUE;
        int i = 0; int j = n - 1;
        while(j >= 0 && i < n){
            minElem = Math.min(nums[j], minElem);
            maxElem = Math.max(nums[i], maxElem);
            stabilityScores[i] += maxElem;
            stabilityScores[j] -= minElem;
            i++; j--;
        }
        for(int idx = 0; idx < n; idx++){
            if(stabilityScores[idx] <= k) return idx;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna