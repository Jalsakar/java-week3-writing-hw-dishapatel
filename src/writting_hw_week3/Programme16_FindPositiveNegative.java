package writting_hw_week3;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class Programme16_FindPositiveNegative {
    public static void main(String[] args) {
        //Scanner declaration for input reading from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        // Closing scanner object
        scanner.close();
    }

    // Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number.");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number.");
        } else {
            System.out.println(number + " is a ZERO.");
        }
    }
}