package exercises.additional.StringArray;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        String[] array = { "hello", "ciao", "salut" };
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a one-word greeting");
        String wordToCheck = input.nextLine().toLowerCase();
        int position = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(wordToCheck)) {
                position = i;
            }
        }

        System.out.println(position);

        input.close();

    }
}
