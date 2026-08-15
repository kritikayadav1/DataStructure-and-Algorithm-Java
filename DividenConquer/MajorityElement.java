package DividenConquer;
public class MajorityElement {

    static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // If count becomes 0, choose a new candidate
            if (count == 0) {
                candidate = nums[i];
            }

            // Same element -> increase count
            if (nums[i] == candidate) {
                count++;
            } 
            // Different element -> decrease count
            else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(nums));
    }
}