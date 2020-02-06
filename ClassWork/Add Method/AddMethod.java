/**
 * method writing excercise
 *
 * @author      AJ Ferraro
 * Course:      COMP B11
 * Created:     10.21.19
 * Source File: AddMethod.java
 */
import java.util.Scanner;

public class AddMethod {

    /**
        adds two integers
        @param addend1 the first addend of the addition
        @param addend2 the second addend of the addition
        @return the result of the addition
    */
    public static int add(int addend1, int addend2){
        return addend1 + addend2;
    }
    
    /**
        calculates the volume of a cube
        @param sideLength the side length of the cube
        @return the volume of the cube
    */
    public static double cubeVolume(double sideLength){
        return Math.pow(sideLength, 3);
    }

    public static void main (String[] args){
        System.out.println(add(2,3));
    }
}
