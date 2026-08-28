class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> board = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> row =
                new ArrayList<>(Collections.nCopies(n, "."));
            board.add(row);
        }

        boolean[] placedCol = new boolean[n];

        logic(board, res, n, 0, placedCol);

        return res;
    }

    private void logic(
        List<List<String>> board,
        List<List<String>> res,
        int n,
        int row,
        boolean[] placedCol
    ) {

        if (row >= n) {
            List<String> solution = new ArrayList<>();
            for (List<String> temp : board) {
                solution.add(String.join("", temp));
            }       
            res.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {

            if (canPlace(board, row, col, placedCol, n)) {

                // Place
                board.get(row).set(col, "Q");
                placedCol[col] = true;

                // Next row
                logic(board, res, n, row + 1, placedCol);

                // Backtrack
                board.get(row).set(col, ".");
                placedCol[col] = false;
            }
        }
    }

    private boolean canPlace(
        List<List<String>> board,
        int row,
        int col,
        boolean[] placedCol,
        int n
    ) {

        // Same column
        if (placedCol[col]) {
            return false;
        }

        // Upper-left diagonal
        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {

            if (board.get(i).get(j).equals("Q")) {
                return false;
            }

            i--;
            j--;
        }

        // Upper-right diagonal
        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < n) {

            if (board.get(i).get(j).equals("Q")) {
                return false;
            }

            i--;
            j++;
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna