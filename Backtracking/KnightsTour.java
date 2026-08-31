package Backtracking;
public class KnightsTour {

    static int N = 8;

    // Knight ke 8 possible moves
    static int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};

    // Check karega move valid hai ya nahi
    public static boolean isSafe(int x, int y, int[][] board) {
        return x >= 0 && x < N
                && y >= 0 && y < N
                && board[x][y] == -1;
    }

    // Main recursive backtracking function
    public static boolean solveKnightTour(int x, int y, int moveCount, int[][] board) {

        // Base case
        // Agar 64 cells visit ho gaye
        if (moveCount == N * N) {
            return true;
        }

        // Knight ke saare 8 moves try karo
        for (int i = 0; i < 8; i++) {

            int nextX = x + xMove[i];
            int nextY = y + yMove[i];

            // Agar move safe hai
            if (isSafe(nextX, nextY, board)) {

                // Move number store karo
                board[nextX][nextY] = moveCount;

                // Recursion
                if (solveKnightTour(nextX, nextY, moveCount + 1, board)) {
                    return true;
                }

                // Backtrack
                board[nextX][nextY] = -1;
            }
        }

        return false;
    }

    // Board print karne ke liye
    public static void printBoard(int[][] board) {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = new int[N][N];

        // Sab cells ko -1 se fill karo
        // -1 ka matlab abhi visit nahi hua
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = -1;
            }
        }

        // Knight ko start karaya 0,0 se
        board[0][0] = 0;

        if (solveKnightTour(0, 0, 1, board)) {

            printBoard(board);

        } else {

            System.out.println("Solution does not exist");
        }
    }
}