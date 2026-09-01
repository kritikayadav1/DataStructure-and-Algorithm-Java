package Backtracking;
public class NQueens {

    // Check karta hai ki (row, col) par queen safe hai ya nahi
    public static boolean isSafe(char[][] board, int row, int col) {

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
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }


    public static void solve(char[][] board, int row) {

        // BASE CASE
        if (row == board.length) {
            printBoard(board);
            System.out.println();
            return;
        }

        // Current row ke saare columns try karo
        for (int col = 0; col < board.length; col++) {

            // CHECK
            if (isSafe(board, row, col)) {

                // PLACE
                board[row][col] = 'Q';

                // EXPLORE
                solve(board, row + 1);

                // UNDO / BACKTRACK
                board[row][col] = '.';
            }
        }
    }


    public static void printBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {

        int n = 4;

        char[][] board = new char[n][n];

        // Initially board empty
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0);
    }
}