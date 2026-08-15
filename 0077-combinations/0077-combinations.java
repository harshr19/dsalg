class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(res, temp, n, k , 1);
        return res;

    }
    private void backtrack(
    List<List<Integer>> res,
    List<Integer> temp,
    int n,
    int k,
    int idx
) {
    if (temp.size() == k) {
        res.add(new ArrayList<>(temp));
        return;
    }

    if (idx > n) return;

    if (n - idx + 1 < k - temp.size()) return;

    temp.add(idx);
    backtrack(res, temp, n, k, idx + 1);

    temp.remove(temp.size() - 1);
    backtrack(res, temp, n, k, idx + 1);
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna