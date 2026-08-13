class Solution {
    public int countGoodNumbers(long n) {
        long a = (n + 1) / 2;
        long b = n / 2;
        int MOD = 1000000007;

        return (int)((long)logic(5, a) * logic(4, b) % MOD);
    }

    private int logic(long x, long n) {
        int MOD = 1000000007;

        if(n == 0) return 1;
        if(n == 1) return (int)x;

        if(n % 2 == 0) {
            return logic((x * x) % MOD, n / 2);
        }

        return (int)((x * logic(x, n - 1)) % MOD);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna