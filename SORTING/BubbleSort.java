package SORTING;

import java.util.*;

public class BubbleSort {
    public static void Sorting(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) {// round ke liye hota kitne orund lega 5element hai toh 5-1 round lega ,4 element ho toh 3 rounds ..
            for (int j = 0; j < arr.length - 1 - turn; j++) {//j humra zero hoga toh j=5 elements h toh toa 5-1-0=4;, j=5-1-1=3 , j5-1-2=2
                if (arr[j] > arr[j + 1]) {// mtlb phle number or agla number ko compare krna jaise 5>4 h toh 
                    int temp = arr[j];// temp bnaana pdta agr direct j=j_1 equal krnge 4 4 hojaega phle usse ek jagah store kro fir wi rhega
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
public static void printArr(int arr[]){
            int n = arr.length;

    for( int i=0;i<n;i++){
        System.out.print(arr[i]+" ");


    }
    System.out.println();

}
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Sorting(arr);
        printArr(arr);


    }
}
