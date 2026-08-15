public class MergeSortStrings {

    // Merge Sort function
    static void mergeSort(String[] arr, int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }

        // Middle index
        int mid = si + (ei - si) / 2;

        // Left half sort
        mergeSort(arr, si, mid);

        // Right half sort
        mergeSort(arr, mid + 1, ei);

        // Merge both sorted halves
        merge(arr, si, mid, ei);
    }

    // Merge function
    static void merge(String[] arr, int si, int mid, int ei) {

        String[] temp = new String[ei - si + 1];

        int i = si;       // Left half
        int j = mid + 1;  // Right half
        int k = 0;        // Temp array

        // Compare strings and put smaller one in temp
        while (i <= mid && j <= ei) {

            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Copy remaining left elements
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp back into original array
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    public static void main(String[] args) {

        String[] arr = {"sun", "earth", "mars", "mercury"};

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}