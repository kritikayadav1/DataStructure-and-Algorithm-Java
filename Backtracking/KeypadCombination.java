package Backtracking;

public class KeypadCombination {

    // 1. MAPPING BANAO
    // Har digit ke corresponding letters
    static String[] keypad = {
        "",      // 0
        "",      // 1
        "abc",   // 2
        "def",   // 3
        "ghi",   // 4
        "jkl",   // 5
        "mno",   // 6
        "pqrs",  // 7
        "tuv",   // 8
        "wxyz"   // 9
    };


    public static void combinations(String str, int index, String current) {

        // 2. BASE CASE
        // Agar saare digits process ho gaye
        // toh jo combination bana hai usko print karo
        if (index == str.length()) {

            System.out.println(current);

            return;
        }
        // 3. CURRENT DIGIT NIKALO
        // Example:
        // str = "23", index = 0
        // str.charAt(0) = '2'
        // '2' - '0' = 2
        int number = str.charAt(index) - '0';


        // 4. CURRENT DIGIT KE LETTERS NIKALO
        // number = 2
        // keypad[2] = "abc"
        String letters = keypad[number];


        // 5. LOOP
        // "abc" ke har letter ko ek-ek karke try karo
        for (int i = 0; i < letters.length(); i++) {


            // 6. CURRENT LETTER NIKALO
            // i=0 -> a
            // i=1 -> b
            // i=2 -> c
            char ch = letters.charAt(i);


            // 7. RECURSION
            // Current letter ko answer me jodo
            // aur NEXT digit par chale jao
            //
            // Example:
            // current = ""
            // ch = 'a'
            // current + ch = "a"
            //
            // index 0 -> index 1
            combinations(str, index + 1, current + ch);
        }
    }


    public static void main(String[] args) {

        // 8. INPUT
        String str = "23";


        // 9. RECURSION START
        // 0 = pehle digit se start
        // "" = starting me combination empty hai
        combinations(str, 0, "");
    }
}