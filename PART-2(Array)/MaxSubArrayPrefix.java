import java.util.*;

public class MaxSubArrayPrefix {

    public static void maxSubArray(int number[]) {

        int maxSum = Integer.MIN_VALUE;

        // Step 1: Prefix Array banana
        int prefix[] = new int[number.length];

        prefix[0] = number[0];

        // Prefix Array Calculate
        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        // Step 2: Har Subarray ka Sum nikalna
        for (int i = 0; i < number.length; i++) {

            int start = i;

            for (int j = i; j < number.length; j++) {

                int end = j;

                int sum;

                // Agar subarray index 0 se start ho rahi hai
                if (start == 0) {
                    sum = prefix[end];
                }

                // Agar subarray 0 se start nahi ho rahi
                else {
                    sum = prefix[end] - prefix[start - 1];
                }

                System.out.println("Sum = " + sum);

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
    }

    public static void main(String[] args) {

        int number[] = {2, 5, -1, 3};

        maxSubArray(number);
    }
}