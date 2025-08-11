package exercises.additional.NumberJoiner;

public class NumberJoiner {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 99 };

        System.out.println(numbersJoined(nums));

        int[] nums2 = { 100 };

        System.out.println(numbersJoined(nums2));

    }

    public static String numbersJoined(int[] numArray) { // if not static, i can't call it because the main (another
                                                         // static
        // method) is the one calling
        String numsJoined = "";

        for (int i = 0; i < numArray.length; i++) {
            if (i == numArray.length - 1) {
                numsJoined += numArray[i];
            } else {
                numsJoined += numArray[i] + ", ";
            }
        }

        return numsJoined;
    }
}
