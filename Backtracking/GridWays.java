package Backtracking;

public class GridWays {

    public static int ways(int i, int j, int n, int m) {

        // Destination par pahuch gaye
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Grid ke bahar chale gaye
        if (i >= n || j >= m) {
            return 0;
        }

        // Right move
        int rightWays = ways(i, j + 1, n, m);

        // Down move
        int downWays = ways(i + 1, j, n, m);

        // Total ways
        return rightWays + downWays;
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 5;

        System.out.println(ways(0, 0, n, m));
    }
}