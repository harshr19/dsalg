class Solution {
    public int minBitFlips(int start, int goal) {
        int res = start ^ goal;
        goal = 0;
        while(res > 0){
            if((res & 1) == 1) goal++;
            res = res >> 1;
        }        
        return goal;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna