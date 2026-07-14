import java.util.*;
public class LargetNumber {

    public static int printLargest(int number[]){
    int largest =Integer.MIN_VALUE;
    for(int i=0; i<number.length;i++){
        if(largest<number[i]){
            largest=number[i];
}
    }
    return largest;

    }
   
    public static void main(String[] args) {
int number[]={23,46,58,57,79,32,68,35,95,36};
    System.out.println(printLargest(number));
}}