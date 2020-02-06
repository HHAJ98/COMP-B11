/**
 * A class for de-mangling lists of doubles, using a specific formula
 *
 * @author      AJ Ferraro, Edward Contreras
 * Course:      COMP B11
 * Created:     11.18.19
 * Source File: Sound.java
 */
import java.util.ArrayList;

public class Sound{
    /**
     * takes a list of double values and swaps elements according to a formula
     * essentially swaps the ith element with the element at 2 * i, unless
     * that's out of range, then it wraps around thanks to [% list.size()]
     *
     * @param list the list to de-mangle
     */
    public static void deMangleList (ArrayList<Double> list){
        double temp;
        for(int i = 0; i < list.size(); i++){
            temp = list.get(i);
            int newIndex = (2 * i) % list.size();
            list.set(i, list.get(newIndex));
            list.set(newIndex, temp);
        }

    }
}
