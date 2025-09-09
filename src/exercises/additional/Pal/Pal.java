package exercises.additional.Pal;

import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a word to check if it is a palindrome");
        String wordToCheck = input.nextLine().toLowerCase();
        char[] charsToCheck = wordToCheck.toCharArray();
        Boolean isPalindrome = true;

        for (int i = 0; i < charsToCheck.length; i++) {
            if (charsToCheck[i] != charsToCheck[charsToCheck.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);

        input.close();
    }
}
