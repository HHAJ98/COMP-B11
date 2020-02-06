import java.util.*;

/**
* This program reads the audio file specified by the user (Only certain
* kinds of audio file will work.), calls deMangleList() from the Sound
* class to make some changes, then plays the sound file.
* 
* @author         Hal Mendoza
* Course:         COMP B11
* Created:        Nov 12, 2017
* Source File:    PlaySoundArrayList.java 
*/

public class PlaySoundArrayList {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter filename: ");
      String file = in.nextLine();
      in.close();
      ArrayList<Double> soundList = StdAudio.readList(file);

      Sound.deMangleList(soundList);
      
      StdAudio.playList(soundList); 
   }
}
