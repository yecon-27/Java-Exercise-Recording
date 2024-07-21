package wku.ava.week10;
import java.util.Scanner;
public class InputBeginningAndEndingRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Start-End numbers: ");
		int s = input.nextInt();
		int e = input.nextInt();
		
		while (s <= e) {
			System.out.println(s);
			s++;
			//Want to have time to understand what happen because the computer execute too fast
			try {
				Thread.sleep(500);
			}catch(InterruptedException f) {
				f.printStackTrace();
			}
		}
		input.close();
	}

}
