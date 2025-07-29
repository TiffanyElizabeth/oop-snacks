package exercises.additional.ContainsNumber;

import java.util.Scanner;

public class ContainsNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = { 5, 12, 7, 42, 9 };
        boolean isFound = false;

        System.out.println("Insert a number of your choice");
        int target = input.nextInt();

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                isFound = true;
            }
        }

        if (isFound == true) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

        input.close();
    }
}
