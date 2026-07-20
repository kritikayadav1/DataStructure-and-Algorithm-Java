package SORTING;
import java.util.*;
public class InbuiltSort {
    public static void main(String[] args) {
        Integer arr[]={3,8,2,4,1,5,7};
        // Arrays.sort(arr,0,4);
Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    System.out.println();}}
