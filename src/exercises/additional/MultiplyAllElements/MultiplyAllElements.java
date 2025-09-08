package exercises.additional.MultiplyAllElements;

public class MultiplyAllElements {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4 };
        int product = 1;

        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
            System.out.println(product);
        }
    }
}
