package Backtracking;
public class SudokuSolver {

    public static boolean solveSudoku(int[][] board) {

        // Empty cell dhundo
        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                if (board[row][col] == 0) {

                    // 1 se 9 tak try karo
                    for (int digit = 1; digit <= 9; digit++) {

                        if (isSafe(board, row, col, digit)) {

                            // PLACE
                            board[row][col] = digit;

                            // EXPLORE
                            if (solveSudoku(board)) {
                                return true;
                            }

                            // UNDO
                            board[row][col] = 0;
                        }
                    }

                    // Koi digit fit nahi hui
                    return false;
                }
            }
        }

        // Pura board fill ho gaya
        return true;
    }


    public static boolean isSafe(
            int[][] board,
            int row,
            int col,
            int digit) {

        // Row check
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) {
                return false;
            }
        }

        // Column check
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }

        // 3x3 grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {

            for (int j = sc; j < sc + 3; j++) {

                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void printBoard(int[][] board) {

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] board = {
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };

        if (solveSudoku(board)) {
            printBoard(board);
        }
    }
}