package ArrayList2;

import java.util.ArrayList;

public class MonotonicArrayList {

    public static boolean isMonotonic(ArrayList<Integer> list) {

        // Shuru mein dono possibilities true maan rahe hain
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {

            // Agar current number agle number se bada hai,
            // toh list increasing nahi ho sakti
            if (list.get(i) > list.get(i + 1)) {
                increasing = false;
            }

            // Agar current number agle number se chhota hai,
            // toh list decreasing nahi ho sakti
            if (list.get(i) < list.get(i + 1)) {
                decreasing = false;
            }
        }

        // Dono mein se koi ek true hai toh list monotonic hai
        return increasing || decreasing;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(isMonotonic(list));
    }
}