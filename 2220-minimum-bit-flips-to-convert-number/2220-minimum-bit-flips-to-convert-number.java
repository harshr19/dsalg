class Solution {
    public int minBitFlips(int start, int goal) {
        int res = 0;
        while(goal != 0 || start != 0){
            if((start & 1) != (goal & 1)) res++;
            start = start >> 1;
            goal = goal >> 1;

        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna