/**
* This class tests the Counter1ConstructorStatic class.
* 
* @author      Hal Mendoza
* Course:      COMP B11
* Created:     Apr 23, 2017
* Source File: Counter1ConstructorStaticTester.java 
*/
public class Counter1ConstructorStaticTester {
   public static void main(String[] args) {
      Counter1ConstructorStatic[] counters = new Counter1ConstructorStatic[10];
      
      System.out.printf("Number of Counter1ConstructorStatic objects = %d\n",
                  Counter1ConstructorStatic.getNumCounters());

      counters[0] = new Counter1ConstructorStatic();
      System.out.printf("Number of Counter1ConstructorStatic objects = %d\n",
                  Counter1ConstructorStatic.getNumCounters());
      for (int i = 1; i < counters.length; ++i) {
         counters[i] = new Counter1ConstructorStatic(i);
         for (int j = 0; j < i; ++j)
            counters[i].count();
      }
      System.out.printf("Number of Counter1ConstructorStatic objects = %d\n",
                  Counter1ConstructorStatic.getNumCounters());

      for (int i = 0; i < counters.length; ++i) {
         System.out.printf("The count for counter %d is %d.\n", i,
                     counters[i].getValue());
      }
   }
}
