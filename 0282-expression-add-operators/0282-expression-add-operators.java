class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        backtrack(num, target, res, sb, 0, 0, 0);

        return res;
    }

    private void backtrack(String num, int target, List<String> res,
                            StringBuilder sb, int idx, long curr, long last) {

        if (idx == num.length()) {
            if (curr == target) {
                res.add(sb.toString());
            }
            return;
        }

        for (int i = idx; i < num.length(); i++) {

           
            if (i > idx && num.charAt(idx) == '0') {
                break;
            }

            long number = Long.parseLong(num.substring(idx, i + 1));

            int oldLength = sb.length();

           
            if (idx == 0) {
                sb.append(number);

                backtrack(num, target, res, sb,
                          i + 1, number, number);

                sb.setLength(oldLength);
            } 
            else {

                // +
                sb.append("+").append(number);

                backtrack(num, target, res, sb,
                          i + 1,
                          curr + number,
                          number);

                sb.setLength(oldLength);

                // -
                sb.append("-").append(number);

                backtrack(num, target, res, sb,
                          i + 1,
                          curr - number,
                          -number);

                sb.setLength(oldLength);

                // *
                sb.append("*").append(number);

                backtrack(num, target, res, sb,
                          i + 1,
                          curr - last + last * number,
                          last * number);

                sb.setLength(oldLength);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna