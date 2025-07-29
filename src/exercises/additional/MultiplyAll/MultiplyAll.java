package exercises.additional.MultiplyAll;

public class MultiplyAll {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4 };
        int result = 1;

        for (int i = 0; i < nums.length; i++) {
            result = result * nums[i];
        }

        System.out.println("Product: " + result);
    }
}
