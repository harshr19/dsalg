class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{' ){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) return false;
                if(ch == ')' && stack.peek() != '(') return false;
                if(ch == ']' && stack.peek() != '[') return false;
                if(ch == '}' && stack.peek() != '{') return false;

                stack.pop();
                
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna