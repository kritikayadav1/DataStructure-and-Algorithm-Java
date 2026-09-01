package RecursionPart2;

public class BinaryStrings {

    // Function
    public static void printBinaryStrings(int n, int lastPlace, String str) {

        // Base Case
        // Agar koi position fill karni baaki nahi hai
        if (n == 0) {
            System.out.println(str); // String print karo
            return;                  // Function yahin khatam
        }

        // ------------------ Place 0 ------------------
        // Hum hamesha 0 rakh sakte hain
        // n-1 : ek position fill ho gayi
        // lastPlace = 0 : last digit ab 0 hai
        // str+"0" : answer me 0 add kar do
        printBinaryStrings(n - 1, 0, str + "0");

        // ------------------ Place 1 ------------------
        // 1 tabhi rakh sakte hain jab pichhli digit 0 ho
        if (lastPlace == 0) {

            // n-1 : ek position aur fill ho gayi
            // lastPlace = 1 : last digit ab 1 hai
            // str+"1" : answer me 1 add kar do
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        int n = 3;

        // Starting Call
        // n = 3
        // lastPlace = 0 (starting me koi last digit nahi hoti,
        // isliye 0 bhejte hain taki pehla 1 bhi place ho sake)
        // str = "" (empty string)
        printBinaryStrings(n, 0, "");
    }
}