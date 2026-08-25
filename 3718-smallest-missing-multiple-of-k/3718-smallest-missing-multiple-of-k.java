class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int smallest = k;
        for(int i : nums){
            if(i == smallest){
                smallest += k;
            }
        }
        return smallest;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna