class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int rowLen = mat.length;
        int colLen = mat[0].length;
        
        for(int row = 0; row < rowLen ; row++){
                int col = row;
                int left = mat[row][col];
                int right = mat[row][colLen - row - 1];
                if(rowLen % 2 == 1 && row == rowLen/2){
                    sum += left;
                    continue;
                }
                sum += right;
                sum += left;
            
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna