package ArrayList2;
import java.util.ArrayList;
import java.util.Collections;

public class FindLonely {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {

        // ArrayList ko sort karo
        Collections.sort(nums);

        // Lonely numbers store karne ke liye
        ArrayList<Integer> list = new ArrayList<>();


        // Beech ke elements check karo
        for (int i = 1; i < nums.size() - 1; i++) {

            // Previous aur next dono se difference 1 se zyada hona chahiye
            if (nums.get(i - 1) + 1 < nums.get(i)
                    && nums.get(i) + 1 < nums.get(i + 1)) {

                list.add(nums.get(i));
            }
        }


        // Agar sirf ek hi element hai
        if (nums.size() == 1) {

            list.add(nums.get(0));
        }


        // First aur last element ko separately check karo
        if (nums.size() > 1) {

            // First element check
            if (nums.get(0) + 1 < nums.get(1)) {

                list.add(nums.get(0));
            }


            // Last element check
            if (nums.get(nums.size() - 2) + 1
                    < nums.get(nums.size() - 1)) {

                list.add(nums.get(nums.size() - 1));
            }
        }


        return list;
    }


    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        System.out.println(findLonely(nums));
    }
}