class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = {-1, -1};

        ListNode prev = head;
        ListNode curr = head.next;

        int idx = 1;
        int first = -1;
        int last = -1;
        int minDist = Integer.MAX_VALUE;

        while (curr.next != null) {
            ListNode next = curr.next;

            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {

                if (first == -1) {
                    first = idx;
                } else {
                    minDist = Math.min(minDist, idx - last);
                }

                last = idx;
            }

            prev = curr;
            curr = next;
            idx++;
        }

        if (first == last) {
            return res;
        }

        res[0] = minDist;
        res[1] = last - first;

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna