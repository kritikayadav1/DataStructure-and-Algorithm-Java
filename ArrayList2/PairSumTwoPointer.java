package ArrayList2;

import java.util.ArrayList;

public class PairSumTwoPointer {

    public static boolean pairSum(
            ArrayList<Integer> list,
            int target) {

        // Left pointer sabse chhote number par
        int left = 0;

        // Right pointer sabse bade number par
        int right = list.size() - 1;

        while (left < right) {

            int sum = list.get(left) + list.get(right);

            // Pair mil gaya
            if (sum == target) {

                System.out.println(
                    "Pair: " + list.get(left)
                    + ", " + list.get(right)
                );

                return true;
            }

            // Sum chhota hai, isliye bada number chahiye
            else if (sum < target) {
                left++;
            }

            // Sum bada hai, isliye chhota number chahiye
            else {
                right--;
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