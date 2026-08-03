package Recursion;

public class Questions {

    public static int fib(int n) {

        // Base Case
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive Call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(fib(n));
    }
}