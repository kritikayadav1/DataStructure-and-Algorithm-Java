package practicequestions;

import java.util.*;

public class Print7s {

    public static void printNumber(int matrix[][]) {

        // 7 ki counting ke liye
        int count = 0;

        // Rows ke liye
        for (int i = 0; i < matrix.length; i++) {

            // Columns ke liye
            for (int j = 0; j < matrix[0].length; j++) {

                // Agar element 7 hai
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }

        // Total 7 print karo
        System.out.println("Number of 7's = " + count);
    }

    public static void main(String[] args) {

        int matrix[][] = {
                {4, 7, 8},
                {8, 8, 7}
        };

        printNumber(matrix);
    }
}