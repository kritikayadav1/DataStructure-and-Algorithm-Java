package ArrayList2;

import java.util.ArrayList;

public class PairSumBruteForce {

    public static boolean pairSum(
            ArrayList<Integer> list,
            int target) {

        // Pehla number select karna
        for (int i = 0; i < list.size(); i++) {

            // i ke baad wala har number check karna
            for (int j = i + 1; j < list.size(); j++) {

                // Dono numbers ka sum target ke equal hai
                if (list.get(i) + list.get(j) == target) {

                    System.out.println(
                        "Pair: " + list.get(i)
                        + ", " + list.get(j)
                    );

                    return true;
                }
            }
        }

        // Koi pair nahi mila
        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(pairSum(list, target));
    }
}