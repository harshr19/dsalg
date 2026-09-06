class Solution {
    public int numDistinct(String s, String t) {

        int[][] dp = new int[s.length()][t.length()];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return logic(s, t, 0, 0, dp);
    }

    public int logic(String s, String t, int i, int j, int[][] dp) {

        if (j == t.length()) {
            return 1;
        }

        if (i == s.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s.charAt(i) == t.charAt(j)) {

            int pick = logic(s, t, i + 1, j + 1, dp);
            int notPick = logic(s, t, i + 1, j, dp);

            return dp[i][j] = pick + notPick;
        }

        return dp[i][j] = logic(s, t, i + 1, j, dp);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna