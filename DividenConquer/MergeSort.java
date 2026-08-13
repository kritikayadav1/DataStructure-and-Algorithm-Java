package DividenConquer;

public class MergeSort {

    // Merge Sort function
    public static void mergeSort(int arr[], int si, int ei) {

        // Base Case
        // Agar sirf ek element ya koi element nahi hai
        if (si >= ei) {
            return;
        }

        // Middle index find karo
        int mid = si + (ei - si) / 2;

        // Left half sort karo
        mergeSort(arr, si, mid);

        // Right half sort karo
        mergeSort(arr, mid + 1, ei);

        // Dono sorted halves ko merge karo
        merge(arr, si, mid, ei);
    }


    // Merge function
    public static void merge(int arr[], int si, int mid, int ei) {

        // Temporary array
        int temp[] = new int[ei - si + 1];

        int i = si;       // Left half ka pointer
        int j = mid + 1;  // Right half ka pointer
        int k = 0;        // Temp array ka pointer

        // Jab tak dono halves me elements hain
        while (i <= mid && j <= ei) {

            // Chhota element temp me daalo
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Agar left half me elements bach gaye
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Agar right half me elements bach gaye
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Temp array ko original array me copy karo
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }


    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1};

        // Merge Sort call
        mergeSort(arr, 0, arr.length - 1);

        // Sorted array print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}