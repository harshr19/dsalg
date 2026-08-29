class Solution {

    boolean[][] rows = new boolean[9][9];
    boolean[][] cols = new boolean[9][9];
    boolean[][] boxes = new boolean[9][9];

    public void solveSudoku(char[][] board) {

        // Store existing numbers
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {

                    int num = board[i][j] - '1';
                    int boxIndex = (i / 3) * 3 + (j / 3);

                    rows[i][num] = true;
                    cols[j][num] = true;
                    boxes[boxIndex][num] = true;
                }
            }
        }

        backtrack(board);
    }

    private boolean backtrack(char[][] board) {

        // Find an empty cell
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    // Try digits 1 -> 9
                    for (int digit = 0; digit < 9; digit++) {

                        int boxIndex = (row / 3) * 3 + (col / 3);

                        if (rows[row][digit] ||
                            cols[col][digit] ||
                            boxes[boxIndex][digit]) {
                            continue;
                        }

                        // Place digit
                        board[row][col] = (char) ('1' + digit);

                        rows[row][digit] = true;
                        cols[col][digit] = true;
                        boxes[boxIndex][digit] = true;

                        // Continue solving
                        if (backtrack(board)) {
                            return true;
                        }

                        // Undo
                        board[row][col] = '.';

                        rows[row][digit] = false;
                        cols[col][digit] = false;
                        boxes[boxIndex][digit] = false;
                    }

                    // No digit worked
                    return false;
                }
            }
        }

        // No empty cells -> solved
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna