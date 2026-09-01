package ArrayList2;
import java.util.*;
public class Mutlidimentional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);
    }
}
