import java.util.Arrays;

/**
* This program tests the arrayShift method in the Array2dShift class
*
* @author 		Hal Mendoza
* Course:		COMP B11
* Created:		Nov 1, 2017, 12:27:17 PM
* Source File:	Array2dShiftMain.java 
*/
public class Array2dShiftMain {

   public static void main(String[] args) {
      int[][] array =
         { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
      System.out.println("Before SHIFT");
      System.out.println(Arrays.deepToString(array));
      Array2dShift.shiftArray(array);
      System.out.println("\nAfter SHIFT");
      System.out.println(Arrays.deepToString(array));
   }

}
