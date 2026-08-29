package Backtracking;

public class MaximumGold {

    // Up, Down, Left, Right
    static int[] rowMove = {-1, 1, 0, 0};
    static int[] colMove = {0, 0, -1, 1};

    // Ye function ek particular cell se
    // maximum gold calculate karega
    public static int collectGold(
            int[][] grid,
            int row,
            int col) {

        // Agar grid se bahar chale gaye
        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length) {

            return 0;
        }

        // Agar cell empty hai ya already visited hai
        if (grid[row][col] == 0) {
            return 0;
        }

        // Current cell ka gold save kar liya
        int currentGold = grid[row][col];

        // DO:
        // Cell ko temporarily visited mark karo
        grid[row][col] = 0;

        int maximumNextGold = 0;

        // Chaaron directions ko try karo
        for (int i = 0; i < 4; i++) {

            int nextRow = row + rowMove[i];
            int nextCol = col + colMove[i];

            // EXPLORE:
            // Next cell se gold collect karo
            int collectedGold =
                    collectGold(grid, nextRow, nextCol);

            // Chaaron paths mein maximum path select karo
            maximumNextGold =
                    Math.max(maximumNextGold, collectedGold);
        }

        // UNDO / BACKTRACK:
        // Cell ka original gold wapas rakh do
        grid[row][col] = currentGold;

        // Current cell ka gold + aage ka maximum gold
        return currentGold + maximumNextGold;
    }

    public static int getMaximumGold(int[][] grid) {

        int answer = 0;

        // Har cell ko starting position banakar dekho
        for (int row = 0; row < grid.length; row++) {

            for (int col = 0;
                 col < grid[0].length;
                 col++) {

                // Sirf gold wale cell se start karna hai
                if (grid[row][col] != 0) {

                    int gold =
                            collectGold(grid, row, col);

                    answer = Math.max(answer, gold);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {0, 6, 0},
            {5, 8, 7},
            {0, 9, 0}
        };

        System.out.println(
            "Maximum Gold = " + getMaximumGold(grid)
        );
    }
}