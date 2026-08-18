public class Fibonacci{

    static void fun(int n) {

        // Base case
        if (n <= 1) {
            return;
        }

        // Loop
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // Recursive call
        fun(n / 2);
    }

    public static void main(String[] args) {

        int n = 8;

        fun(n);
    }
}
