/**
 * Calculates and prints the volume of a sphere with a hardcoded radius
 *
 * @author      AJ Ferraro
 * Course:      COMP B11
 * Created:     9.04.19
 * Source File: SphereVolume.java
 */

public class SphereVolume{
    public static void main(String[] args){
        double radius = 10;
        double volume = 4.0 * Math.PI * Math.pow(radius, 3) / 3;

        System.out.println("The volume of a sphere with radius " + radius + " is:\n" + volume);
    }
}
