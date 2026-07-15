class Solution {
    public int subtractProductAndSum(int n) {
        if(n <= 9) return 0;
        int sum = 0;
        int prod = 1;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            n/=10;
        }
        return prod - sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna