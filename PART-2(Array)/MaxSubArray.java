import java.util.*;
public class MaxSubArray {
public static void SubArray(int number[]){
    int maxSum =Integer.MIN_VALUE;
int sum =0;
for(int i =0;i<number.length;i++){
    int start=i;
    for(int j=i;j<number.length;j++){
        int end=j;
        sum=0;
        for(int k=start;k<=end;k++){
            sum+=number[k];
            System.out.print(number[k]+" ");
}
System.out.println("sum is these ="+sum );
if(sum>maxSum){
maxSum = sum;
}
    }
    System.out.println();

}
    System.out.println(" maximum of all are ="+maxSum);

System.out.println();
}
    public static void main(String[] args) {
int number[]={1,3,5,7,9,11};
SubArray(number);
    }
}