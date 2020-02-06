/**
 * Calculates and prints the volume of a sphere with a hardcoded radius, now
 * with added input^tm
 *
 * @author      AJ Ferraro, Sean Smith
 * Course:      COMP B11
 * Created:     9.09.19
 * Source File: SphereVolume.java
 */
import java.util.Scanner;

public class SphereVolumeInput{
    public static void main(String[] args){
        double radius = 10;
        double volume;
        Scanner in = new Scanner(System.in);

        System.out.print("What's the radius of your shpere? ");
        radius = in.nextDouble();

        volume = 4.0 * Math.PI * Math.pow(radius, 3) / 3;

        System.out.println("The volume of a sphere with radius " + radius + " is:\n" + volume);
    }
}
