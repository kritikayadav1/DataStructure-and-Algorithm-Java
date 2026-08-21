package Backtracking;
public class Permutation {

    public static void findPermutation(String str, String ans) {

        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Try every character
        for (int i = 0; i < str.length(); i++) {

            // Current character
            char curr = str.charAt(i);

            // Remove current character
            String newStr =
                    str.substring(0, i) + str.substring(i + 1);

            // Recursion
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {

        String str = "ABC";

        findPermutation(str, "");
    }
}