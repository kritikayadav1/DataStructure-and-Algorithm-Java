package DividenConquer;
public class QuickSort {

    // Partition array ko arrange karta hai
    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];   // Last element ko pivot banaya

        int i = si - 1;        // Chhote elements ki boundary

        // j array ko scan karega
        for (int j = si; j < ei; j++) {

            // Agar current element pivot se chhota hai
            if (arr[j] < pivot) {

                i++;

                // arr[i] aur arr[j] ko swap karo
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Pivot ko uski correct position par rakho
        i++;

        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }


    // Quick Sort
    public static void quickSort(int arr[], int si, int ei) {

        // Agar 0 ya 1 element hai, toh stop
        if (si >= ei) {
            return;
        }

        // Pivot ki correct position find karo
        int pIdx = partition(arr, si, ei);

        // Pivot ke left wale part ko sort karo
        quickSort(arr, si, pIdx - 1);

        // Pivot ke right wale part ko sort karo
        quickSort(arr, pIdx + 1, ei);
    }


    public static void main(String args[]) {

        int arr[] = {5, 2, 8, 1, 3};

        quickSort(arr, 0, arr.length - 1);

        // Sorted array print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}