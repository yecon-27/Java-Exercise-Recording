package wku.ava.as2;
import java.util.Scanner;
public class Chap5_Lab4 {

	public static void main(String[] args) {
		System.out.print("Please enter a word: ");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		
		System.out.println("The word before reversed is: " + word);
		System.out.print("The word after reversed is: ");
		for (int i = word.length() - 1; i >= 0 ; i--) {
			System.out.print(word.charAt(i));
			//charAt(index):Returns the character at the specified index from this string.
			//it is helpful to avoid the case of the input word is empty
			//Cannot use word[i], it is array method
		}
		input.close();
	}

}
