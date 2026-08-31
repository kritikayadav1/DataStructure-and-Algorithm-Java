package PracticeQuestions;
public class FirstNonRepeating {

    public static char findFirstNonRepeating(String str) {

        // String ke har character ko ek-ek karke lenge
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            // Check karenge ch puri string me kitni baar hai
            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            // Agar character sirf ek baar aaya hai
            if (count == 1) {
                return ch;
            }
        }

        // Agar sab characters repeat ho rahe hain
        return '#';
    }


    public static void main(String[] args) {

        String str = "aabbcddee";

        char result = findFirstNonRepeating(str);

        if (result == '#') {
            System.out.println("No non-repeating character");
        } else {
            System.out.println("First non-repeating character = " + result);
        }
    }
}