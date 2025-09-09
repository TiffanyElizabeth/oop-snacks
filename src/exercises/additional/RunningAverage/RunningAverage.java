package exercises.additional.RunningAverage;

public class RunningAverage {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8 };
        int sum = 0;
        // int average = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            int average = sum / (i + 1);
            System.out.println(average);

        }
    }
}
