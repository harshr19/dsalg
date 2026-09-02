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
    public ListNode partition(ListNode head, int x) {
        
        ListNode lessDummy = new ListNode();
        ListNode greaterDummy = new ListNode();

        ListNode less = lessDummy;
        ListNode greater = greaterDummy;

        ListNode idx = head;

        while(idx != null){
            if(idx.val < x){
                less.next = idx;
                less = idx;
                
            }
            else {
                greater.next = idx;
                greater = greater.next;
            }

            idx = idx.next;
        }
        greater.next = null;
        greaterDummy = greaterDummy.next;
        less.next = greaterDummy;
        return lessDummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna