package writting_hw_week3;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);//Direct call
        scanner.close();//Closing the scanner object
    }
    //Static method

    public static void isItOddOrEvenNumber(int number) {
        //Ternary operator is used
        String evenorodd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The "+number+" is "+evenorodd+" number");
    }
}