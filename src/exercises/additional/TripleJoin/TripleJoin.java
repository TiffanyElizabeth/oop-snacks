package exercises.additional.TripleJoin;

public class TripleJoin {
    public static void main(String[] args) {
        int[] test = { 2, 3, 4, 5, 6 };
        System.out.println(TripledJoined(test));

        int[] test2 = { 2 };
        System.out.println(TripledJoined(test2));
    }

    public static String TripledJoined(int[] nums) {
        String tripleJoin = "";
        boolean isFirst = true;

        for (int i = 0; i < nums.length; i++) {
            int triple = nums[i] * 3;
            if (isFirst) {
                tripleJoin += triple;
                isFirst = false;
            } else {
                tripleJoin += "-" + triple;
            }
        }
        return tripleJoin;
    }
}
