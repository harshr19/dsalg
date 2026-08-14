class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        StringBuilder elem = new StringBuilder();
        logic(res, 0, n, elem);
        return res;
    }
    private void logic(ArrayList<String>res, int idx, int n, StringBuilder elem){
        if(idx >= n){
          res.add(elem.toString());
          return;  
        } 
        
        //add 0
        elem.append('0');
        logic(res,idx+1,n,elem);
        
        elem.deleteCharAt(elem.length() - 1);
        
        
        elem.append('1');
        logic(res,idx+1,n,elem);
        elem.deleteCharAt(elem.length() - 1);
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna