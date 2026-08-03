package Recursion;

public class PracticeQuestions2 {

    public static int factorial(int n) {

        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive Call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(factorial(n));
    }
}