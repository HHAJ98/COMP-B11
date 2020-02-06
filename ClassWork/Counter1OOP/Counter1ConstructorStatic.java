/**
* This class simulates a counter used to count things
*
* @author 		AJ Ferraro, Martin Martinez
* Course:		COMP B11
* Created:		11.27.19
* Source File:	Counter1ConstructorStatic.java
*/
public class Counter1ConstructorStatic {
    private int value;
    private static int tracker = 0;

    /**
     * initializes the insctance variable value to the value of the parameter
     *
     * @param val initial value of the instance variable "value"
     */
    public Counter1ConstructorStatic(int val){
        value = val;
        tracker ++;
    }

    /**
     * calls the overloaded consructer to initialize value to 0
     */
    public Counter1ConstructorStatic(){
        value = 0;
        tracker++;
    }


    /**
     * retruns the number of Counter1ConstructorStatic objects created so far.
     *
     * @return value that tracks the number of Counter1ConstructorStatic objects
     *         created so far
     */
    public static int getNumCounters(){
        return tracker;
    }



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
