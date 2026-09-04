package ArrayList2;
import java.util.ArrayList;

public class ContaineWaterTwoPointer {

    public static int storeWater(ArrayList<Integer> height) {

        int maxWater = 0;

        // Two pointers
        int lp = 0;
        int rp = height.size() - 1;

        // Jab tak pointers ek dusre se nahi milte
        while (lp < rp) {

            // Smaller height
            int h = Math.min(height.get(lp), height.get(rp));

            // Width
            int width = rp - lp;

            // Current water
            int currWater = h * width;

            // Maximum update
            maxWater = Math.max(maxWater, currWater);


            // Smaller height wale pointer ko move karo
            if (height.get(lp) < height.get(rp)) {

                lp++;

            } else {

                rp--;
            }
        }

        return maxWater;
    }


    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}