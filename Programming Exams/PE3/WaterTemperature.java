/**
 * Asks the user for the water tempurature and prints out if that water would be
 * solid, liquid, or gas at that tempurature
 *
 * @author      AJ Ferraro
 * Course:      COMP B11
 * Created:     10.16.19
 * Source File: WaterTemperature.java
 */
import java.util.Scanner;

public class WaterTemperature {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double temp;
        final double ABS_ZERO = -273.15;

        System.out.print("Enter the tempurature of water in degrees Celcius: ");
        temp = in.nextDouble();

        if(temp >= 100)
            System.out.println("Gas");
        else if(temp < ABS_ZERO)
            System.out.println("Below absolute zero");
        else if(temp <= 0)
            System.out.println("Solid");
        else
            System.out.println("Liquid");
        }
}
