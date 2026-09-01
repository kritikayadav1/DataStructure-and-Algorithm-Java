package ArrayList1;
import java.util.*;
public class SwapNumbers {

    public static void swap(ArrayList<Integer>list, int idx1, int idx2 ){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
list.add(2);
list.add(4);
list.add(6);
list.add(8);
list.add(10);
int idx1=2 , idx2=4;
swap(list,idx1 ,idx2);
System.out.println(list);
    }
}
