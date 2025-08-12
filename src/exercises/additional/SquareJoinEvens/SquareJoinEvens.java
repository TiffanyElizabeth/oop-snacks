package exercises.additional.SquareJoinEvens;

public class SquareJoinEvens {
    public static void main(String[] args) {
        int[] test = { 2, 3, 4, 5, 6 };
        System.out.println(SquaredJoinedEvens(test));

        int[] test2 = { 2 };
        System.out.println(SquaredJoinedEvens(test2));
    }

    public static String SquaredJoinedEvens(int[] nums) {
        String squaredJoinedEvens = "";
        int squaredNum;
        boolean isFirstFiltered = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                squaredNum = nums[i] * nums[i];
                if (isFirstFiltered) {
                    squaredJoinedEvens += squaredNum;
                    isFirstFiltered = false;
                } else {
                    squaredJoinedEvens += ", " + squaredNum;
                }

            }
        }

        return squaredJoinedEvens;
    }
}
