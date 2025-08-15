package exercises.additional.AlternatingElements;

import java.util.Arrays;

public class AlternatingElements {
    public static void main(String[] args) {
        int[] test = { 10, 20, 30, 40, 50, 60 };

        System.out.println(Arrays.toString(alternateElements(test)));

    }

    public static int[] alternateElements(int[] nums) {
        int[] alternatingNums = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                alternatingNums[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                alternatingNums[index] = nums[i];
                index++;
            }
        }

        return alternatingNums;
    }
}
