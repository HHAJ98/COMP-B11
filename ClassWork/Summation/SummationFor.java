/**
 * Asks the user for an integer, n, and returns the sum of the integers from 1
 * to that number, now using for loops.
 *
 * @author      AJ Ferraro, Jair Reyes
 * Course:      COMP B11
 * Created:     10.09.19
 * Source File: SummationFor.java
 */
import java.util.Scanner;

public class SummationFor {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("Enter N: ");
        n = in.nextInt();

        for(int i = 1; i <= n; i++)
            sum += i;

        System.out.printf("The sum of all i, where i runs from 1 to %d equals" +
        " %d.\n", n, sum);
    }
}
