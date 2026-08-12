package ArrayList2;
import java.util.ArrayList;

public class PairSum2 {

    public static boolean pairSum2(ArrayList<Integer> list, int target) {

        int n = list.size();

        // Step 1: Breaking point find karna
        int bp = -1;

        for (int i = 0; i < n - 1; i++) {

            // Jahan bada number ke baad chhota number aaye
            if (list.get(i) > list.get(i + 1)) {

                bp = i;
                break;
            }
        }

        // Agar list rotate nahi hui ho
        if (bp == -1) {
            bp = n - 1;
        }


        // Step 2: Pointers set karna

        // bp + 1 par smallest element
        int lp = (bp + 1) % n;

        // bp par largest element
        int rp = bp;


        // Step 3: Pair find karna
        while (lp != rp) {

            // Current sum
            int sum = list.get(lp) + list.get(rp);


            // CASE 1: Pair mil gaya
            if (sum == target) {

                return true;
            }


            // CASE 2: Sum chhota hai
            // Sum badhana hai → lp aage
            else if (sum < target) {

                lp = (lp + 1) % n;
            }


            // CASE 3: Sum bada hai
            // Sum chhota karna hai → rp peeche
            else {

                rp = (n + rp - 1) % n;
            }
        }


        // Koi pair nahi mila
        return false;
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));
    }
}