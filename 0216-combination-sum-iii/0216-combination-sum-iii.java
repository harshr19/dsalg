class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(res, temp, k, n, 1);

        return res;
    }
    private void backtrack(
    List<List<Integer>> res,
    List<Integer> temp,
    int k,
    int target,
    int start
) {
    if (target == 0 && temp.size() == k) {
        res.add(new ArrayList<>(temp));
        return;
    }

    if (target < 0 || temp.size() >= k) return;

    for (int i = start; i <= 9; i++) {
        if (i > target) break;

        temp.add(i);
        backtrack(res, temp, k, target - i, i + 1);
        temp.remove(temp.size() - 1);
    }
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna