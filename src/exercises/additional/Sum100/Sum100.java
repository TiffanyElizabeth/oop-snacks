package exercises.additional.Sum100;

public class Sum100 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60 };
        int sum = 0;
        int numOfnums = 0;

        int i = 0;

        while (i < nums.length && sum + nums[i] <= 100) {
            sum = sum + nums[i];
            numOfnums++;
            i++;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Number of elements = " + numOfnums);
    }
}
