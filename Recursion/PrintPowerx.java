package Recursion;

public class PrintPowerx{

    public static double myPow(double x, int n) {

        // Base Case
        if (n == 0) {
            return 1;
        }

        // Recursive Call
        double halfPower = myPow(x, n / 2);

        // Half Power Square
        double halfPowerSq = halfPower * halfPower;

        // Odd Case
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {

        double x = 2;
        int n = 5;

        System.out.println(myPow(x, n));

    }
}