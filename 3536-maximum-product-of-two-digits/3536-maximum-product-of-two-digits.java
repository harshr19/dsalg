class Solution {
    public int maxProduct(int n) {
        int maxProd = 0; int maxElem = n % 10;
        n/=10;
        while(n > 0){
            int digit = n%10;
            maxProd = Math.max((digit)* maxElem, maxProd);
            maxElem = Math.max(maxElem, digit);
            n/=10;
        }
        return maxProd;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna