/**
* This class tests the Counter1Constructor class.
* 
* @author      Hal Mendoza
* Course:      COMP B11
* Created:     Apr 19, 2017
* Source File: Counter1ConstructorTester.java 
*/
public class Counter1ConstructorTester {
   public static void main(String[] args) {
      Counter1Constructor[] counters = new Counter1Constructor[10];

      counters[0] = new Counter1Constructor();
      for (int i = 1; i < counters.length; ++i) {
         counters[i] = new Counter1Constructor(i);
         for (int j = 0; j < i; ++j)
            counters[i].count();
      }

      for (int i = 0; i < counters.length; ++i) {
         System.out.printf("The count for counter %d is %d.\n", i,
                     counters[i].getValue());
      }
   }
}
