package Recursion;

public class PracticeQuestions4 {

    public static int sum(int n) {

        // Base Case
        if (n == 1) {
            return 1;
        }

        // Recursive Call
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(sum(n));
    }
}