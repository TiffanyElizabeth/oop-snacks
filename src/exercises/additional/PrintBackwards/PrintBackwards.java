package exercises.additional.PrintBackwards;

public class PrintBackwards {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };

        // for (int i = array.length - 1; i >= 0; i--) {
        // System.out.println(array[i]);
        // }

        int i = array.length - 1;

        while (i >= 0) {
            System.out.println(array[i]);
            i--;
        }
    }

}
