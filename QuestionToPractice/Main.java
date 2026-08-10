package QuestionToPractice;
public class Main {

    public static int[] findMissingAndRepeated(int[][] grid) {

        int n = grid.length;
        int total = n * n;

        // Frequency array
        int[] freq = new int[total + 1];

        // Count every number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        int repeating = -1;
        int missing = -1;

        // Find repeating and missing
        for (int i = 1; i <= total; i++) {

            if (freq[i] == 2) {
                repeating = i;
            }

            if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {

        int[][] grid = {
            {1, 2},
            {2, 4}
        };

        int[] answer = findMissingAndRepeated(grid);

        System.out.println("Repeating number = " + answer[0]);
        System.out.println("Missing number = " + answer[1]);
    }
}
