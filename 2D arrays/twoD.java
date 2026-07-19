import java.util.*;

public class twoD {

    public static boolean Search(int matrix[][], int key) {

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {

                if(matrix[i][j] == key) {
                    System.out.println("Found at index (" + i + "," + j + ")");
                    return true;
                }

            }
        }

        System.out.println("Not Found");
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
    
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        Search(matrix, key);
    }
}