package ArrayList2;
public class ContainerWaterBruteForce {

    public static int maxArea(int[] height) {

        int maxWater = 0;

        // Har line ko ek-ek karke choose karenge
        for (int i = 0; i < height.length; i++) {

            // i ke baad wali har line ke saath pair banayenge
            for (int j = i + 1; j < height.length; j++) {

                // Width = dono indices ke beech ka distance
                int width = j - i;

                // Height = chhoti wali line
                int h = Math.min(height[i], height[j]);

                // Area / Water
                int water = width * h;

                // Maximum water update
                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int ans = maxArea(height);

        System.out.println("Maximum Water = " + ans);
    }
}