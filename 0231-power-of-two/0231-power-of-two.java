class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n == 0 || n== Integer.MIN_VALUE) return false;
        
        return (n & (n - 1)) == 0 ?  true : false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna