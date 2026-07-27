package String;

public class StringCompression {

    public static String compress(String str) {

        // Empty StringBuilder
        StringBuilder sb = new StringBuilder("");

        // String ke har character par jao
        for (int i = 0; i < str.length(); i++) {

            // Har character kam se kam 1 baar to aayega
            int count = 1;

            // Jab tak next character same hai
            while (i < str.length() - 1 &&
                   str.charAt(i) == str.charAt(i + 1)) {

                count++;   // Count badhao
                i++;       // Next same character par jao
            }

            // Character ko add karo
            sb.append(str.charAt(i));

            // Agar character ek se zyada baar aaya hai
            if (count > 1) {
                sb.append(count);
            }
        }

        // Final compressed string return karo
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "aaabbcccdd";

        System.out.println(compress(str));

    }
}