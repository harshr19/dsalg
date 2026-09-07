class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        if(n == 0){
            if(n % 2 == 0) return false;
            return true;
        }
        while(k-- > 0){
            n = n >> 1;
        }
        return n % 2 == 1 ? true : false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna