class Solution {
    public int[] singleNumber(int[] nums) {
        int xum = 0;
        for(int i: nums) 
            xum = xum ^ i;
        xum = (xum & (xum - 1) ) ^ xum;

        int setBucket = 0;
        int notSetBucket = 0;

        for(int i : nums){
            if((xum & i) == 0) notSetBucket=  notSetBucket ^ i;
            else setBucket = setBucket ^ i;
        }
        return new int[]{setBucket, notSetBucket};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna