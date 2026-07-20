package SORTING;

public class CountingSort {

    public static void countingSort(int arr[]) {

        // Step 1 : Largest number find karo
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2 : Count array banao
        int count[] = new int[largest + 1];

        // Step 3 : Count fill karo
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
// Step 4 : Original array ko dobara fill karo
        int j = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 2, 5, 8, 3, 1, 3};

        countingSort(arr);

        printArr(arr);
    }
}