class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        logic(res, temp, candidates, target, 0);
        return res;
    }

    private void logic(List<List<Integer>> res, List<Integer> temp, int[] candidates, int target, int idx) {

        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        if (idx >= candidates.length || target < 0) {
            return;
        }
        for(int i = idx; i < candidates.length; i++){
            if(i > idx && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            //pick
            temp.add(candidates[i]);
            logic(res, temp, candidates, target - candidates[i], i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna