/**
* This class simulates a counter used to count things
*
* @author 		Hal Mendoza
* Course:		COMP B11
* Created:		Apr 21, 2015, 10:56:12 AM
* Source File:	Counter1.java
*/
public class Counter1 {
   private int value;

   /**
    * Increment count by one
    */
   public void count(){
      value = value + 1;
   }

   /**
    * Returns the value
    * @return the value
    */
   public int getValue(){
      return value;
   }

   /**
    * Method author: AJ Ferraro
    * resets the counter to 0
    */
   public void reset(){
       value = 0;
   }
}
