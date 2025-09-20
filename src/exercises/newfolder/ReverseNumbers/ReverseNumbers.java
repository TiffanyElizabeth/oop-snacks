package exercises.newfolder.ReverseNumbers;

import java.util.Arrays;

public class ReverseNumbers {
    public static void main(String[] args) {
        int number = 987654;
        String numStr = Integer.toString(number);
        char[] numArray = numStr.toCharArray();

        int[] reversed = new int[numArray.length];

        for (int i = 0; i < numArray.length; i++) {
            reversed[i] = numArray[numArray.length - 1 - i] - '0';
        }

        System.out.println(Arrays.toString(reversed));
    }
}
