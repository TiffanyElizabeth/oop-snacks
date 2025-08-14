package exercises.additional.PlainArrays;

public class PlainArrays {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] moreNums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            moreNums[i] = nums[i];
        }
        moreNums[nums.length] = 6;

        nums = moreNums;

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
