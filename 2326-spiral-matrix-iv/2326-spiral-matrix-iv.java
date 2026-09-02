/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];
        
        for(int[] arrays : res){
            Arrays.fill(arrays, -1);
        }
        ListNode idx = head;

        int left = 0,
            right = n - 1,
            top = 0,
            bottom = m - 1;
        while(top <= bottom && left <= right){
            if(idx == null) break;
            //left => right
            for(int j = left; j <= right && idx != null; j++){
                res[top][j] = idx.val;
                idx = idx.next;
            }
            top++;
            // top => bottm
            for(int i = top; i <= bottom && idx != null; i++){
                res[i][right] = idx.val;
                idx = idx.next;
            }
            right--;
            // right => left
            if(top <= bottom){
                for(int j = right; j >= left && idx != null; j--){
                    res[bottom][j] = idx.val;
                    idx = idx.next;
                }
                bottom--;
            }
            // bottom => up
            if(left <= right){
                for(int i = bottom; i >= top && idx != null; i--){
                    res[i][left] = idx.val;
                    idx = idx.next;
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