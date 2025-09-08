package exercises.additional.SumAll;

public class SumAll {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        int sum = 0;
        // Expected output: 10

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println(sum);
        }
    }
}
