class Solution {
    public int divide(int dividend, int divisor) {
        int isNeg = 1;

        if ((dividend < 0 && divisor > 0) ||
            (dividend > 0 && divisor < 0)) {
            isNeg = -1;
        }

        if (dividend == divisor) {
            return 1;
        }

        if (divisor == 1) {
            return dividend;
        }

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long res = 0;

        while (n >= d) {
            int count = 0;

            while (n >= (d << (count + 1))) {
                count++;
            }

            res += (1L << count);
            n -= (d << count);
        }

        if (res >= Integer.MAX_VALUE && isNeg == 1) {
            return Integer.MAX_VALUE;
        }

        return isNeg == -1 ? (int) -res : (int) res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna