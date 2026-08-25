import java.util.*;

class Solution {

    String[] mapping = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        backtrack(digits, 0, "");

        return ans;
    }

    void backtrack(String digits, int index, String current) {

        // Agar saare digits process ho gaye
        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        // Current digit
        int digit = digits.charAt(index) - '0';

        // Us digit ke letters
        String letters = mapping[digit];

        // Har letter try karo
        for (char ch : letters.toCharArray()) {

            // Letter add
            backtrack(digits, index + 1, current + ch);
        }
    }
}