package exercises.additional.IsPositive;

import java.util.Scanner;

public class IsPositive {
    public static boolean isPositive(int input) {
        return input > 0;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert a number:");
        int input = userInput.nextInt();

        System.out.println(isPositive(input));

        userInput.close();
    }
}
