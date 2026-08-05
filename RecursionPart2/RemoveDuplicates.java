package RecursionPart2;

public class RemoveDuplicates {

    public static void removeDuplicates(String str, int idx,
            StringBuilder newStr, boolean map[]) {

        // Base Case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Current Character
        char currChar = str.charAt(idx);

        // Duplicate Character
        if (map[currChar - 'a'] == true) {

            removeDuplicates(str, idx + 1, newStr, map);

        } else {

            // First Time Character
            map[currChar - 'a'] = true;

            newStr.append(currChar);

            removeDuplicates(str, idx + 1, newStr, map);
        }
    }

    public static void main(String[] args) {

        String str = "appnnacollege";

        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}p