/**
 * Asks the user for a set of numbers, and then sums the negative numbers and
 * postivie numbers separately.
 *
 * @author      AJ Ferraro, Roman Cadena
 * Course:      COMP B11
 * Created:     10.14.19
 * Source File: CountNumbers.java
 */
import java.util.Scanner;

public class CountNumbers {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double sumPos = 0;
        double sumNeg = 0;

        System.out.print("Enter numbers (Q to quit): ");
        while(in.hasNextDouble()){
            double input = in.nextDouble();
            if(input > 0)
                sumPos += input;
            else
                sumNeg += input;
        }
        
        System.out.printf("Total of positive numbers is %.4f\nTotal of negative"
         + " numbers is %.4f\n", sumPos, sumNeg);

    }
}
