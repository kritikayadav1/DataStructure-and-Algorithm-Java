package DividenConquer;
public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            // Middle element find karo
            int mid = start + (end - start) / 2;

            // Agar target mil gaya
            if (nums[mid] == target) {
                return mid;
            }

            // Check karo left half sorted hai ya nahi
            if (nums[start] <= nums[mid]) {

                // Target left half ke andar hai
                if (nums[start] <= target && target < nums[mid]) {

                    // Right side hata do
                    end = mid - 1;

                } else {

                    // Left side hata do
                    start = mid + 1;
                }

            } else {

                // Left sorted nahi hai,
                // iska matlab right half sorted hai

                // Check karo target right half me hai
                if (nums[mid] < target && target <= nums[end]) {

                    // Left side hata do
                    start = mid + 1;

                } else {

                    // Right side hata do
                    end = mid - 1;
                }
            }
        }

        // Target array me nahi mila
        return -1;
    }


    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int target =6;

        int result = search(nums, target);

        System.out.println("Target index of number:" + target +" =" + result );
    }
}