class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int carry = 0;
        int i = num.length - 1;
        while(carry > 0 || k > 0 || i >= 0) {
            int n = i >= 0 ? num[i--]: 0;
            int a = k%10;
            int sum = n + a + carry;
            res.add(sum%10);
            carry = sum/10;
            k = k/10;
        }

        Collections.reverse(res);
        return res;
    }
    
} 

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna