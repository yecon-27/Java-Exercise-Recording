package wku.ava.as2;
import java.util.Scanner;
public class Chap5_Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Start number: ");
		int s = input.nextInt();
		System.out.print("Enter the End number: ");
		int e = input.nextInt();
		
		//Program should show all even numbers between the given range. 
		for(int i = s; i <= e; i++ ) {
			if(i % 2 == 0)
				System.out.print(i + " ");
		}
		input.close();
	}
//Start from end to begin:
//
}
