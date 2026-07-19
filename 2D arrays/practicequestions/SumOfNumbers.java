package practicequestions;

public class SumOfNumbers {
    public static void SumOfNumbers(int nums[][]){
        // int n =matrix.length;
int sum=0;
for(int j=0;j<nums[0].length;j++){
    sum+=nums[0][j];

}
System.out.println("sum is "+sum);
    }
    public static void main(String[] args) {
    int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    SumOfNumbers(nums);
    }
    
}
