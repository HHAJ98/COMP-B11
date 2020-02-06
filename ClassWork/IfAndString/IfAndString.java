 /*This program tells if a word starts with a or not.
/@Authors: Sean Smith, Anthony Ferraro
/Course: Comp B1A
/Created: September 16, 2019
/Source File: IfandString.java
*/


import java.util.Scanner;

public class IfAndString {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		String word;
		
		System.out.print("Please enter a word: ");
		word = sc.nextLine();

		if (word.charAt(0) == 'a')
			System.out.printf("\"%s\" starts with  \'a\'.\n", word);
		else
			System.out.printf("\"%s\" does not start with  \'a\'.\n", word);
	}
}
