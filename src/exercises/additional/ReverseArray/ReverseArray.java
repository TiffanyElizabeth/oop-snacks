package exercises.additional.ReverseArray;

public class ReverseArray {

    public static void main(String[] args) {
        int[] testArray = { 1, 2, 3, 4, 5 };

        for (int i = testArray.length - 1; i >= 0; i--) {
            System.out.print(testArray[i] + " ");
        }
    }
}
