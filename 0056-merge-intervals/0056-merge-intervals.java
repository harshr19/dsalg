import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<List<Integer>> res = new ArrayList<>();
        
        if(intervals.length == 1) return intervals;
        for(int i = 1; i < intervals.length; i++){
            int a = intervals[i][0];
            int b = intervals[i][1];

            if(a <= end){
                if(b > end) end = b;
                continue;
            }
            else if(a > end){
                List<Integer> interval = new ArrayList<>(Arrays.asList(start, end));
                res.add(interval);
                start = a;
                if(b > end) end = b;        
            }
        }
        List<Integer> interval = new ArrayList<>(Arrays.asList(start, end));
        res.add(interval);
        return listToArray(res);
    }
    private int[][] listToArray(List<List<Integer>> res){
      int[][] ans = new int[res.size()][];

      for (int i = 0; i < res.size(); i++) {
            List<Integer> innerList = res.get(i);
            ans[i] = new int[innerList.size()];
            for (int j = 0; j < innerList.size(); j++) {
                ans[i][j] = innerList.get(j);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna