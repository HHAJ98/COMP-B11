/**
 * Uses the Monte Carlo Method to calculate an estiamtion of Pi, demonstrates
 * using methods
 *
 * @author      AJ Ferraro, Christian Gomez
 * Course:      COMP B11
 * Created:     10.21.19
 * Source File: PiEstimateMethod.java
 */
import java.util.*;

public class PiEstimateMethod {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Random random = new Random(1234);

        System.out.println("Enter number of tries (Q to quit): ");
        while(in.hasNextDouble()){
            int input = in.nextInt();
            double pi = estimatePi(input, random);
            System.out.printf("With %,d tries, your estimate of PI is %.6f\n",
            input, pi);
        }
        System.out.println("BYE");
    }

    /**
    * This method computes an estimate of PI by generating random (x,y)'s in the
    * positive quadrant of the unit circle and then taking the ratio of the
    * number of times (x,y) is within the unit circle to the total number of
    * (x,y)'s generated. Multiplying that ratio by 4 gives the estimate of PI.
    *
    * @param numTries the number of tries to use in estimate
    * @param random the Random object with which to generate random doubles
    * @return An estimate of PI using numTries
    */
    public static double estimatePi (int numTries, Random random){
        int hits = 0;
        for(int i = 0; i < numTries; i++){
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (x * x + y * y <= 1)
                hits++;
        }
        double estimate = 4.0 * hits / numTries;
        return estimate;
    }
}
