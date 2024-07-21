package wku.ava.week10;

public class PatternsOfStars {

	public static void main(String[] args) {
		//Square Filled Stars
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}//There are multiple lines
			System.out.println();
			}
		//Left-Aligned Triangle Stars
		for(int i = 5; i > 0 ; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}//There are multiple lines
			System.out.println();
			}
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}//There are multiple lines
			System.out.println();
			}
		}
	}


