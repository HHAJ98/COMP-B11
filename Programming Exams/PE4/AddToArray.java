/**
* This class contains a method to add an integer value to all the elements in an
* array of ints. Main method is used to give an example of addToArray in action.
*
* @author 		AJ Ferraro
* Course:		COMP B11
* Created:		12.02.19
* Source File:	AddToArray.java
*/

import java.util.Arrays;

public class AddToArray{

    /**
     * Adds a single integer value to each element in an array of integers
     *
     * @param data the initial array to be modified
     * @param addend the single value to add to each element
     */
    public static void addToArray(int[] data, int addend){
        for(int i = 0; i < data.length; i++)
            data[i] += addend;
    }

    public static void main(String[] args){
        int[] array1 = new int[5];
        int[] array2 = {5, 7, 11, 13, 2, 3};

        addToArray(array1, 10);
        System.out.println(Arrays.toString(array1));

        addToArray(array2, 22);
        System.out.println(Arrays.toString(array2));

    }
}
