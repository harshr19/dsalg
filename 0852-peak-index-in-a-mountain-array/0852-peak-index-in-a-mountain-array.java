class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 1, end = arr.length - 2;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if( arr[mid] > Math.max(arr[mid - 1], arr[mid + 1]) ) return mid;
            
            if(arr[mid - 1] >= Math.max(arr[mid + 1], arr[mid])){
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna