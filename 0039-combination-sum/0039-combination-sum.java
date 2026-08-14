class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

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

        // Pick -> can pick same element again
        temp.add(candidates[idx]);
        logic(res, temp, candidates, target - candidates[idx], idx);
        temp.remove(temp.size() - 1);

        // Don't pick -> move forward
        logic(res, temp, candidates, target, idx + 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna