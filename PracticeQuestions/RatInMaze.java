package PracticeQuestions;


public class RatInMaze {

    public static void findPaths(
            int[][] maze,
            int row,
            int col,
            String path,
            boolean[][] visited,
            ArrayList<String> ans) {

        int n = maze.length;

        // 1. OUT OF BOUND
        if (row < 0 || col < 0 || row >= n || col >= n) {
            return;
        }

        // 2. BLOCKED CELL
        if (maze[row][col] == 0) {
            return;
        }

        // 3. ALREADY VISITED
        if (visited[row][col]) {
            return;
        }

        // 4. DESTINATION MIL GAYA
        if (row == n - 1 && col == n - 1) {
            ans.add(path);
            return;
        }

        // 5. Current cell ko visited mark karo
        visited[row][col] = true;

        // DOWN
        findPaths(maze, row + 1, col,
                  path + "D", visited, ans);

        // LEFT
        findPaths(maze, row, col - 1,
                  path + "L", visited, ans);

        // RIGHT
        findPaths(maze, row, col + 1,
                  path + "R", visited, ans);

        // UP
        findPaths(maze, row - 1, col,
                  path + "U", visited, ans);

        // 6. BACKTRACK / UNDO
        visited[row][col] = false;
    }


    public static void main(String[] args) {

        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int n = maze.length;

        boolean[][] visited = new boolean[n][n];

        ArrayList<String> ans = new ArrayList<>();

        findPaths(maze, 0, 0, "", visited, ans);

        System.out.println(ans);
    }
}
    
}
