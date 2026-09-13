class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int s_idx = 0;
        int t_idx = 0;

        while(t_idx < t.length() && s_idx < s.length()){
            if(t.charAt(t_idx) == s.charAt(s_idx)) s_idx++;
            t_idx++;
        }
        return s_idx == s.length();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna