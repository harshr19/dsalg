class Solution {
    public boolean buddyStrings(String s, String goal) {
        int m = s.length();
        int n = goal.length();
        if(m != n) return false;
        int anomaly = 0;
        int first = -1;
        int next = -1;
        for(int i = 0; i < n; i++){
            char elem1 = s.charAt(i);
            char elem2 = goal.charAt(i);
            if(elem1 != elem2){
                if(first < 0) first = i;
                else next = i;
                anomaly++;
                if(anomaly > 2) return false;
            }
        }
            if(anomaly == 1) return false;
            int[] freq = new int[26];
            if(anomaly == 0){
                for(char c : s.toCharArray()){
                    freq[c - 'a' ]++;
                    if(freq[c - 'a' ] == 2) return true;
                }
                return false;
            }
            
            return (s.charAt(first) == goal.charAt(next) && s.charAt(next) == goal.charAt(first)) ;
            
        }

    
} 
/* 
    0 = >
        a a
        a a
        a b c d a
        a b c d a

        a b
        a b
        
    2 => 
        a b a
        b a a

         a a b b
         b a a b

        e f g
        f f t
*/

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna