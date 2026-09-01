public class SudokuSolver {

    // Sudoku solve karne wala function
    public static boolean solveSudoku(int[][] board) {

        // STEP 1: Empty cell find karo
        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                // 0 means empty cell
                if (board[row][col] == 0) {
                
                    // STEP 2: 1 se 9 tak numbers try karo
                    for (int num = 1; num <= 9; num++) {

                        // STEP 3: Check karo number safe hai ya nahi
                        if (isSafe(board, row, col, num)) {

                            // DO / PLACE
                            board[row][col] = num;

                            // EXPLORE
                            // Baaki Sudoku solve karke dekho
                            if (solveSudoku(board)) {
                                return true;
                            }

                            // UNDO / BACKTRACK
                            // Agar aage solution nahi mila
                            board[row][col] = 0;
                        }
                    }

                    // 1 se 9 tak koi bhi number kaam nahi kiya
                    return false;
                }
            }
        }

        // Agar koi empty cell nahi mili
        // Matlab Sudoku solve ho gaya
        return true;
    }


    // Check karega ki num ko board[row][col] par rakh sakte hain ya nahi
    public static boolean isSafe(int[][] board, int row, int col, int num) {

        // 1. ROW CHECK
        for (int j = 0; j < 9; j++) {

            if (board[row][j] == num) {
                return false;
            }
        }


        // 2. COLUMN CHECK
        for (int i = 0; i < 9; i++) {

            if (board[i][col] == num) {
                return false;
            }
        }


        // 3. 3x3 BOX CHECK

        // Current cell ka box kis row se start hota hai
        int startRow = (row / 3) * 3;

        // Current cell ka box kis column se start hota hai
        int startCol = (col / 3) * 3;


        for (int i = startRow; i < startRow + 3; i++) {

            for (int j = startCol; j < startCol + 3; j++) {

                if (board[i][j] == num) {
                    return false;
                }
            }
        }


        // Row, column aur box teeno me number nahi mila
        return true;
    }


    // Board print karne ke liye
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

            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},

            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},

            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };


        // Sudoku solve karo
        if (solveSudoku(board)) {

            System.out.println("Solved Sudoku:");

            printBoard(board);

        } else {

            System.out.println("Sudoku cannot be solved.");
        }
    }
}