package Backtracking;
public class NQueens {

    static int n = 4;

    public static void main(String[] args) {

        // 4 x 4 ka board banaya
        char[][] board = new char[n][n];

        // Har box ko empty '.' se fill kiya
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Row 0 se queen rakhna start
        solve(board, 0);
    }


    static void solve(char[][] board, int row) {

        // Saari rows complete → solution mil gaya
        if (row == n) {
            printBoard(board);
            return;
        }

        // Current row ke har column ko try karo
        for (int col = 0; col < n; col++) {

            // Check karo queen safe hai ya nahi
            if (isSafe(board, row, col)) {

                // Safe hai → Queen rakho
                board[row][col] = 'Q';

                // Next row par jao
                solve(board, row + 1);

                // Wapas aaye → Queen hatao
                // Ye BACKTRACKING hai
                board[row][col] = '.';
            }
        }
    }


    static boolean isSafe(char[][] board, int row, int col) {

        // 1. Same column check
        for (int i = row - 1; i >= 0; i--) {

            if (board[i][col] == 'Q') {
                return false;
            }
        }


        // 2. Upper-left diagonal check
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }


        // 3. Upper-right diagonal check
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }


        // Teeno checks pass → safe
        return true;
    }


    static void printBoard(char[][] board) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}