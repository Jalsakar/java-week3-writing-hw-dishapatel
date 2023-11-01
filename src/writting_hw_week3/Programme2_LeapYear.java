package writting_hw_week3;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Programme2_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year : ");
        int year = scanner.nextInt();
        Programme2_LeapYear leapYear = new Programme2_LeapYear();
        leapYear.isItLeapYear(year);
        scanner.close();//Closing the scanner object
    }

    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("the year " + year + " is leap year.");
            return;// to exit early and avoid unnecessary processing
        }
        System.out.println("The year " + year + " is not a leap year.");
    }
}