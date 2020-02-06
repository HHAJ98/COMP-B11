/**
 * Fill and sort an array of random numbers in [0,100) of a user specified size,
 * and then prints each element of the array in order
 *
 * @author      AJ Ferraro, Edward Contreras
 * Course:      COMP B11
 * Created:     10.28.19
 * Source File: FillAndSortArray.java
 */
import java.util.*;

public class FillAndSortArray {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Random random = new Random(1234);
        double[] data;

        System.out.print("How many elements in array?: ");
        data = new double[in.nextInt()];

        for (int i = 0; i < data.length; i++) {
            data[i] = 100 * random.nextDouble();
        }
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }

}
