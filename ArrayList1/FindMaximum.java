package ArrayList1;
import java.util.*;

public class FindMaximum {

    // Maximum find karne wala function
    public static int findMax(ArrayList<Integer> list) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Maximum = " + findMax(list));
    }
}