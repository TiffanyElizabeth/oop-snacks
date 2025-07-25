package exercises.additional.MaxValue;

public class MaxValue {
    public static void main(String[] args) {
        int[] nums = { 3, 17, 25, 6, 42, 9 };
        int maxNum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }

        System.out.println("Maximum value: " + maxNum);
    }
}
