/**
 * takes an array of a specified size, and fills it with random numbers within a
 * specified range, using different methods. Takes arguments from the command
 * line.
 *
 * @author      AJ Ferraro, Edward Contreras
 * Course:      COMP B11
 * Created:     10.30.19
 * Source File: FillAndSortArrayMethodArgs.java
 */
import java.util.*;

public class FillAndSortArrayMethodArgs {
    public static void main (String[] args){
        int size = Integer.parseInt(args[0]);
        double low = Double.parseDouble(args[1]);
        double high = Double.parseDouble(args[2]);
        double[] data = new double[size];

        fillArrayRandom(data, low, high);
        Arrays.sort(data);
        printArray(data);
    }

    /**
     * takes an array and fills it with random numbers in [low, high)
     *
     * @param array the array to fill with random numbers
     * @param low the low end of the allowed range of random numbers, inc.ve
     * @param high the high end of the allowed range of random numbers, exc.ve
     */
    public static void fillArrayRandom(double[] array, double low, double high){
        Random random = new Random(1234);
        for(int i = 0; i < array.length; i++){
            double range = high - low;
            array[i] = range * random.nextDouble() + low;
        }
    }

    /**
     * prints out the contents of a double array
     *
     * @param array the array to be printed out
     */
    public static void printArray(double[] array){
        for(double element : array){
            System.out.println(element);
        }
    }

}
