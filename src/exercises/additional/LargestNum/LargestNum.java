package exercises.additional.LargestNum;

public class LargestNum {
    public static void main(String[] args) {
        int[] numbers = { 4, 15, 2, 9 };
        int largestNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNum) {
                largestNum = numbers[i];
            }

        }
        System.out.println(largestNum);
    }
}
