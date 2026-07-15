// import java.util.*;

public class MaxSumKadane {

    public static void kadaneSum(int numbers[]) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, -1, 4, -2, 4};

        kadaneSum(numbers);
    }
}