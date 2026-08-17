class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> keypad = new ArrayList<>();
        keypad.add("");
        keypad.add("");
        keypad.add("abc");
        keypad.add("def");
        keypad.add("ghi");
        keypad.add("jkl");
        keypad.add("mno");
        keypad.add("pqrs");
        keypad.add("tuv");
        keypad.add("wxyz");

        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        backtrack(keypad, res, temp, digits, 0);
        return res;
    }

    private void backtrack(
        List<String> keypad,
        List<String> res,
        StringBuilder temp,
        String digits,
        int idx
    ) {
        if (idx == digits.length()) {
            res.add(temp.toString());
            return;
        }

        int number = digits.charAt(idx) - '0';

        for (int i = 0; i < keypad.get(number).length(); i++) {

            // pick
            temp.append(keypad.get(number).charAt(i));

            backtrack(keypad, res, temp, digits, idx + 1);

            // undo
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna