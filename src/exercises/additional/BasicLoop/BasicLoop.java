package exercises.additional.BasicLoop;

public class BasicLoop {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4 };

        /*
         * for (int i = 0; i < test.length; i++) {
         * System.out.println(test[i]);
         * }
         */

        int i = 0;

        while (i < test.length) {
            System.out.println(test[i]);
            i++;
        }
    }
}
