class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        backtrack(s, res, temp, 0);
        return res;        

    }
    private void backtrack(String s, List<List<String>> res, List<String> temp, int idx){
        if(idx >= s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = idx; i < s.length(); i++){

            if( isPalindrome( s, idx, i ) ){
                
                temp.add(s.substring(idx, i + 1));
                
                backtrack(s, res, temp, i + 1);
                
                temp.remove(temp.size() - 1);
            }

        }
    }

    private boolean isPalindrome(String check, int a, int b){
        while(a <= b){
            if(check.charAt(a) != check.charAt(b)) return false;
            a++; b--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna