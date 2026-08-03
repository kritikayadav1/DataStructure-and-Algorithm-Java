package Recursion;

public class Questions {

    public static int firstOcc(int arr[], int key, int i) {

        // Base Case
        if (i == arr.length) {
            return -1;
        }

        // Agar key mil gayi
        if (arr[i] == key) {
            return i;
        }

        // Next index par jao
        return firstOcc(arr, key, i + 1);
    }

    public static void main(String[] args) {

        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;

        System.out.println(firstOcc(arr, key, 0));

    }
}