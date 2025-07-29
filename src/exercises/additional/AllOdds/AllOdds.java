package exercises.additional.AllOdds;

public class AllOdds {
    public static void main(String[] args) {
        int[] nums = { 3, 10, 21, 4, 9, 12 };

        int i = 0;

        System.out.print("Odd numbers: ");

        while (i < nums.length) {
            if (nums[i] % 2 != 0) {
                System.out.print(nums[i] + " ");
            }
            i++;
        }
    }
}
