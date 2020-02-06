import java.util.Random;

/**
 * 
 * This program tests and scores the Counter1ConstructorStatic class.
 *
 * @author        Hal Mendoza
 * Course:        COMP B11
 * Created:       Apr 23, 2017
 * Source File:   Counter1ConstructorStaticGrade.java
 */
public class Counter1ConstructorStaticGrade {
   /**
    * Test static method and variable. Return point deduction.
    * @return point deduction
    */
   public static int testStatic() {
      int scoreDeduction = 0;

      System.out.printf("\nTesting static method and variable\n");
      int numCountersToCreate = (new Random()).nextInt(123);
      // Create objects, but don't store their references
      for (int i = 0; i < numCountersToCreate; ++i) {
         if ((i + numCountersToCreate) % 3 == 0)
            new Counter1ConstructorStatic();
         else
            new Counter1ConstructorStatic(i);
      }

      int numCountersCreated = Counter1ConstructorStatic.getNumCounters();
      if (numCountersCreated != numCountersToCreate + 2) { // created two earlier
         scoreDeduction += 100;
         System.out.printf("getNumCounters() returns %d, but should return %d "
            + "(-100 pts)\n", numCountersCreated, numCountersToCreate + 2);
      } else
         System.out.printf("Static method checks out OK.\n");
      return scoreDeduction;
   }
   /**
    * Test counter by calling count numTimesToCount. Return point deduction.
    * @param counter Counter to use
    * @param numTimesToCount number of times to count
    * @return score deduction
    */
   public static int testCount(Counter1ConstructorStatic counter, int numTimesToCount) {
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
      Counter1ConstructorStatic counter = new Counter1ConstructorStatic();
      if ((count = counter.getValue()) != 0) {
         score -= 50;
         System.out.printf("No-arg constructor incorrect: getValue() returns"
            + " %d, but should return 0 (-50 pts)\n", count);
      } else
         score -= testCount(counter, numTimesToCount);

      int argument = numTimesToCount + 1;
      System.out.printf("\nTesting constructor with argument of %d\n",
                  argument);
      counter = new Counter1ConstructorStatic(argument);
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

      score -= testStatic();

      System.out.printf("\nScore:  %d%%\n", score);
   }

}
