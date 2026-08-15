class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(res, temp, nums, k, n, 0);

        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int k, int target, int idx){
        if(target == 0){
            if( temp.size() == k){
            res.add(new ArrayList<>(temp));
            }
            return;
        }
        
        if(idx >= nums.length) return;
        if(target < 0) return;
        
        //pick
        temp.add(nums[idx]);
        backtrack(res, temp, nums, k, target - nums[idx], idx + 1);

        temp.remove(temp.size() - 1);

        backtrack(res, temp, nums, k, target, idx + 1);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna