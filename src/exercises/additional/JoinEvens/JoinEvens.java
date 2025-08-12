package exercises.additional.JoinEvens;

public class JoinEvens {
    public static void main(String[] args) {
        int[] test1 = { 3, 5, 8, 14, 31, 40 };
        System.out.println(evensString(test1));

        int[] test2 = { 48 };
        System.out.println(evensString(test2));
    }

    public static String evensString(int[] nums) {
        String evensJoined = "";
        boolean firstEven = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (firstEven) {
                    evensJoined += nums[i];
                    firstEven = false;
                } else {
                    evensJoined += ";" + nums[i];
                }
            }
        }

        return evensJoined;
    }
}
