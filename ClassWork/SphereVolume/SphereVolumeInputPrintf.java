/**
 * Calculates and prints the volume of a sphere with a user-input radius, now
 * with formatted strings
 *
 * @author      AJ Ferraro
 * Course:      COMP B11
 * Created:     9.11.19
 * Source File: SphereVolume.java
 */
import java.util.Scanner;

public class SphereVolumeInputPrintf{
    public static void main(String[] args){
        double radius = 10;
        double volume;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = in.nextDouble();

        volume = 4.0 * Math.PI * Math.pow(radius, 3) / 3;

        System.out.printf("The volume of a sphere\nwith radius %.4f is %.4f.\n",
        radius, volume);
    }
}
