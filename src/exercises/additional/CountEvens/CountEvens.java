package exercises.additional.CountEvens;

public class CountEvens {
    public static void main(String[] args) {
        int[] nums = { 4, 7, 2, 9, 12, 5, 6, 8, 1, 3 };
        int evensCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evensCount++;
            }
        }

        System.out.println("Number of even numbers: " + evensCount);
    }
}
