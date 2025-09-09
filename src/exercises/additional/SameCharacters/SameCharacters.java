package exercises.additional.SameCharacters;

import java.util.Arrays;
import java.util.Scanner;

public class SameCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert a word with 5 characters");
        String a = input.nextLine();

        System.out.println("Insert another word with 5 characters");
        String b = input.nextLine();

        char[] charsA = a.toLowerCase().toCharArray();
        char[] charsB = b.toLowerCase().toCharArray();

        System.out.println(charsA);
        System.out.println(charsB);

        Arrays.sort(charsA);
        Arrays.sort(charsB);

        System.out.println(charsA);
        System.out.println(charsB);

        if (Arrays.equals(charsA, charsB)) {
            System.out.println("The words contain the same characters");
        } else {
            System.out.println("The words don't contain the same characters");
        }

        input.close();

    }
}
