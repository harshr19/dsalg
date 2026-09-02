class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = n - 1;
        
        int idx = 1;
        while(left <= right && top <= bottom){
            
            for(int col = left; col <= right; col++){
                res[top][col] = idx++;
            }
            top++;
            for(int row = top; row <= bottom; row++){
                res[row][right] = idx++;
            }
            right--;
            if(top <= bottom){
                for(int col = right; col >= left; col--){
                    res[bottom][col] = idx++;
                }
                bottom--;
            }
            if(left <= right){
                for(int row = bottom; row >= top; row--){
                    res[row][left] = idx++;
                }
                left++;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna