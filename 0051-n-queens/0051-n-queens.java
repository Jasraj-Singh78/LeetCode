class Solution {

    public void solve(char board[][], int row, int n,
                      List<List<String>> ans) {

        if (row == n) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {

            // Check if the position is safe
            if (isSafe(board, row, col, n)) {

                board[row][col] = 'Q';

                // Recursively solve the next row
                solve(board, row + 1, n, ans);

                // Backtrack: remove the queen
                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char board[][], int row, int col, int n) {

        // Check the same column above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(board, 0, n, ans);

        return ans;
    }
}

