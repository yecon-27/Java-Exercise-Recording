
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		//1.Read Input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		//2.Obtain the lowest and highest digit the length of integer:
		//You must convert it to String type, since the primitive type cannot make index comparation
		//Enter a String directly
		String num = input.nextLine();
		input.close();
		
		//Enter an integer, use (adding string become string)type casting to obtain
		/*int num = input.nextInt();
		 *int length = (num + "").length(); */
		
		//3.Print
		if(isPalindrome(num))
			System.out.println("This integer is a Palindrome number.");
		else
			System.out.println("This integer is not a Palindrome number.");
	}
	
	//4.Palindrome void method:
	//Using a loop and if statement to compare the digits bit by bit(increment and decrement)
	public static boolean isPalindrome(String num) {
		int length = num.length();
		int low = 0;
		int high = length - 1;
		while(low < high) {
			if(num.charAt(low) != num.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
	//According to identity value, print the result
		return true;
	}
}
