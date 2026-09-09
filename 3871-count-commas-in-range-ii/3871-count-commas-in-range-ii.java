class Solution {
    public long countCommas(long n) {
        
        long x = n;   

        long commas = 0;
        long start = 1000;
        int k = 1;

        while (start <= x) {
            long end = start * 1000 - 1;

            long count = Math.min(x, end) - start + 1;

            commas += count * k;

            start *= 1000;
            k++;
        }

        return commas;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna