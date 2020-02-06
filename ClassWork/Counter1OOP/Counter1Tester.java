/**
* This class tests the CounterFromText class.
* @author      Hal Mendoza
* Course:      COMP B11
* Created:     Apr 21, 2015, 10:50:52 AM
* Source File: Counter1Tester.java
*/
public class Counter1Tester {
   public static void main(String[] args)
   {
      Counter1 tally = new Counter1();
      tally.count();
      tally.count();
      tally.count();
      int result = tally.getValue();
      System.out.println("Value: " + result);
      tally.reset(); // <- AJ Ferraro added this method call
      tally.count();
      tally.count();
      result = tally.getValue();
      System.out.println("Value: " + result);
   }
}
