import java.util.*;
public class LinearSearch {
public static int LinearSearch(int nums[],int key){
for(int i=0;i<nums.length;i++){
    if(nums[i]==key){
return i;
    }
}
return -1;

}
    public static void main(String[] args) {
        int nums[]={23,43,63,74,73,31,456,22,57,35,36,78,43};
        int key= 22;
int index= LinearSearch(nums,key);
if(index==-1){
    System.out.print("NOT FOUND");

}else{
    System.out.println("FOUND AT INDEX NUMBER : "+  index);
}

    }
}