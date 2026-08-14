class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        logic(res,sb,0,0,n);
        return res;
        
    }
    private void logic(List<String> res, StringBuilder sb, int open, int close, int n){
        if(sb.length() == n*2){
            if(open == close && (open == n && close == n))  res.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append('(');
           
            logic(res, sb, open+1, close, n);
            sb.deleteCharAt(sb.length() - 1);

        }
        if(close < open){
             sb.append(')');
            
            logic(res, sb, open, close+1, n);
            sb.deleteCharAt(sb.length() - 1);
            
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna