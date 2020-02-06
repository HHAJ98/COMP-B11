/**
 * Asks the user for an integer, n, and returns the sum of the integers from 1
 * to that number.
 *
 * @author      AJ Ferraro, Jair Reyes
 * Course:      COMP B11
 * Created:     10.02.19
 * Source File: Summation.java
 */
import java.util.Scanner;

public class Summation {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        int i = 1;
        int sum = 0;

        System.out.print("Enter N: ");
        n = in.nextInt();

        while(i <= n){
            sum += i;
            i++;
        }

        System.out.printf("The sum of all i, where i runs from 1 to %d equals" +
        " %d.\n", n, sum);
    }
}
