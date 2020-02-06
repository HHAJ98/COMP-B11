/**
 * contains a method that shifts an array one column to the left, wrapping the
 * edges
 *
 * @author      AJ Ferraro, Michael Mejia
 * Course:      COMP B11
 * Created:     11.04.19
 * Source File: Array2dShift.java
 */

public class Array2dShift{
    /**
     * shifts each element of a 2d int array one clomun to the left, warpping
     * the edges.
     *
     * @param data the array to be shifted
     */
    public static void shiftArray(int[][] data){
        for(int i = 0; i < data.length; i++){          //rows
            int firstElem = data[i][0];
            for(int j = 0; j < data[i].length; j++){   //columns
                if(j < data[i].length - 1)
                    data[i][j] = data[i][j + 1];
                else
                    data[i][j] = firstElem;
            }
        }
    }
}
