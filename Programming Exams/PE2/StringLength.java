/**
 * Asks the user for a line of characters, then prints it, along with the number
 * of characters in that line
 *
 * @author      AJ Ferraro
 * Course:      COMP B11
 * Created:     10.07.19
 * Source File: StringLength.java
 */
import java.util.Scanner;

public class StringLength {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String inputLine = "";
        int lineLength = 0;

        System.out.println("Enter a line:");
        inputLine = in.nextLine();
        lineLength = inputLine.length();

        System.out.printf("\"%s\" has %d characters in it.\n", inputLine,
        lineLength);
    }
}
