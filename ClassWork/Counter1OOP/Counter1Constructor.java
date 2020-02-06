/**
* This class simulates a counter used to count things
*
* @author 		AJ Ferraro, Christian Gomez
* Course:		COMP B11
* Created:		11.25.19
* Source File:	Counter1Constructor.java
*/
public class Counter1Constructor {
    private int value;

    /**
     * initializes the insctance variable value to the value of the parameter
     *
     * @param val initial value of the instance variable "value"
     */
    public Counter1Constructor(int val){
        value = val;
    }

    /**
     * calls the overloaded consructer to initialize value to 0
     */
    public Counter1Constructor(){
        this(0);
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
