public class Solution {
    public int[] ResultArray(int[] nums) {
        int n = nums.Length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int a1 = 0; int a2 = 0;
        for(int it = 2; it < n; it++){
            if(arr1[a1] > arr2[a2]){
                arr1[++a1] = nums[it];
            }
            else arr2[++a2] = nums[it];
        }
        int i = 0; int j = 0;
        while(arr1[j] != 0){
            nums[i] = arr1[j] ;
            i++; j++;
        } 
        j = 0;
        while(arr2[j] != 0){
            nums[i] = arr2[j] ;
            i++; j++;
        }

        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna