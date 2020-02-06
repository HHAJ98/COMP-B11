import java.util.Random;

/**
 * 
 * This program tests and scores the Counter1Constructor class.
 *
 * @author        Hal Mendoza
 * Course:        COMP B11
 * Created:       Apr 19, 2017, 12:41:21 PM
 * Source File:   Counter1ConstructorGrade.java
 */
public class Counter1ConstructorGrade {

   public static int testCount(Counter1Constructor counter, int numTimesToCount) {
      int initialCount = counter.getValue();
      int count;
      int scoreDeduction = 0;
      for (int i = 0; i < numTimesToCount; ++i)
         counter.count();
      System.out.printf("Calling count() %d times\n", numTimesToCount);
      count = counter.getValue();
      if (count != initialCount + numTimesToCount) {
         scoreDeduction = 50;
         System.out.printf("Incorrect count getValue() returns %d, but "
            + "should return %d (-50 pts)\n",
                     count, initialCount + numTimesToCount);
      } else {
         System.out.printf("\tCount correct\n");
      }
      return scoreDeduction;
   }
   public static void main(String[] args) {
      int numTimesToCount;
      int count;
      int score = 100;
      Random random = new Random();
      numTimesToCount = random.nextInt(12) + 3;

      System.out.printf("Testing no-arg constructor\n");
      Counter1Constructor counter = new Counter1Constructor();
      if ((count = counter.getValue()) != 0) {
         score -= 50;
         System.out.printf("No-arg constructor incorrect: getValue() returns"
            + " %d, but should return 0 (-50 pts)\n", count);
      } else
         score -= testCount(counter, numTimesToCount);

      int argument = numTimesToCount + 1;
      System.out.printf("\nTesting constructor with argument of %d\n",
                  argument);
      counter = new Counter1Constructor(argument);
      if ((count = counter.getValue()) != argument) {
         score -= 50;
         System.out.printf("Constructor incorrect: getValue() returns"
            + " %d, but should return %d (-50 pts)\n", count, argument);
      } else
         score -= testCount(counter, numTimesToCount);

      System.out.printf("\nCalling reset()\n");
      counter.reset();
      count = counter.getValue();
      if (count != 0) {
         score -= 50;
         System.out.printf("Incorrect count after reset() - getValue() "
            + "returns %d, but should return 0 (-50 pts)\n",
                     count);
      } else {
         System.out.printf("reset() works correctly.\n");
      }

      System.out.printf("\nScore:  %d%%\n", score);
   }

}
