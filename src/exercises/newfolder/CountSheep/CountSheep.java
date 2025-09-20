package exercises.newfolder.CountSheep;

public class CountSheep {
    public static void main(String[] args) {
        boolean[] sheep = { true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true };

        int count = 0;

        for (int i = 0; i < sheep.length; i++) {
            if (sheep[i] == true) {
                count++;
            }
        }

        System.out.println(count);
    }
}
