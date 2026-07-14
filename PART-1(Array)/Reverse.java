import java.util.*;
public class Reverse {
public static void ReverseArray(int nums[]){
int start=0; int end=nums.length-1;
while(start<end){
int temp=nums[start];
nums [start]=nums[end];
nums[end]=temp;
start++;
end--;
}
}

    public static void main(String[] args) {
        int nums[]={23,43,2,74,25,643,3,567,3,3567,43,74};
ReverseArray(nums);
 for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }    }
}