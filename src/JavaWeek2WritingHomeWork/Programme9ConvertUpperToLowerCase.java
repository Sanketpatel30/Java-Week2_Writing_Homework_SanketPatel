package JavaWeek2WritingHomeWork;
import java.util.Scanner;

/**
 * Write a program to covert the upper case to lower case.
 */
public class Programme9ConvertUpperToLowerCase {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme9ConvertUpperToLowerCase t = new Programme9ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }
    // conversion of Uppercase to lower case method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
