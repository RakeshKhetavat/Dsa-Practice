public class FindMaximumElement {

    public static int findMax(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {7, 2, 9, 1, 5};

        int ans = findMax(nums);

        System.out.println("Maximum Element: " + ans);
    }
}
