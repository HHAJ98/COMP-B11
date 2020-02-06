/**
 * --------DESCRIPTION--------
 *
 * @author      AJ Ferraro, Joshua Navarro Harbin
 * Course:      COMP B11
 * Created:     09.18.19
 * Source File: LetterAt.java
 */


import java.util.Scanner;

public class LetterAt {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		String word;
		int target;
		char letter;

		System.out.print("Enter a word: ");
		word = in.nextLine();
		System.out.print("Enter index: ");
		target = in.nextInt();

		if(target >= word.length()) {
			System.out.printf("%d is not a legal index for \"%s\".\n", target, word);
		} else {
			letter = word.charAt(target);
			System.out.printf("In word \"%s\", the letter at index %d is \'%c\'.\n", word, target, letter);
		}

	}
}
