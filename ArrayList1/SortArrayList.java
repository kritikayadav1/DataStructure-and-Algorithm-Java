package ArrayList1;
import java.util.*;
public class SortArrayList {
    public static void main(String[]args){
            ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(0);
        list.add(3);
        System.out.println(list);
Collections.sort(list);
System.out.println(list);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);



    }
    
}
