/**
 * Prints out a table of numbers from 1-10, and their n-th powers from n=1 to n=4
 *
 * @author      AJ Ferraro
 * Course:      COMP B11
 * Created:     10.14.19
 * Source File: PowerTable.java
 */
 public class PowerTable{
    public static void main(String[] args) {
        for (int x = 1; x < 11; x++){
            for(int power = 1; power < 5; power++){
                //System.out.print((int)Math.pow(x, power) + "\t");
                System.out.printf("%7.0f", Math.pow(x, power));
            }
            System.out.println();
        }
     }
 }
