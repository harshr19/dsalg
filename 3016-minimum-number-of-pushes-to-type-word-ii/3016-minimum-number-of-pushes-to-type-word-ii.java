class Solution {
    public int minimumPushes(String word) {
        int res = 0;
        int[] freq = new int[26];
        for(int i = 0; i < word.length(); i++){
            freq[word.charAt(i) - 'a'] += 1;
        }
        Arrays.sort(freq);
        reverseArr(freq);
        
        for(int i = 0; i < freq.length; i++){
            res +=( i / 8 + 1 ) * freq[i];
        }
        return res;
    }
    void reverseArr(int[] arr){
        int a  = 0; int b = arr.length - 1;
        while(a < b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b]= temp;
            a++; b--;
        }
    }
}

//xxxx yyyy zz q f g h j k l  q w e r t 


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna