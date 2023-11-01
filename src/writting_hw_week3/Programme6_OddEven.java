package writting_hw_week3;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6_OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to check : ");
        int number = scanner.nextInt();
        Programme6_OddEven oddEven = new Programme6_OddEven();
        //  oddEven.isItEvenOrOddNumber(number); another way to call method in the main method
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number.");
        //Closing the scanner object
        scanner.close();
    }

    //Checking the odd or even
    public String isItEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}