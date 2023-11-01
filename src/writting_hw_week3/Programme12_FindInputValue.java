package writting_hw_week3;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
import java.util.Scanner;

public class Programme12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any characters : ");
        char ch = scanner.next().charAt(0);
        Programme12_FindInputValue inputValue = new Programme12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing scanner
        scanner.close();
    }
    //Find the input value is ALPHABET, DIGIT and SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch){
        if((ch>='a' && ch<='z')|| (ch>='A'&& ch<='Z')){
            System.out.println(ch + " is an ALPHABET.");
        } else if ((ch>='0'&&ch<='9')) {
            System.out.println(ch + " is a DIGIT.");
        }else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }
}
