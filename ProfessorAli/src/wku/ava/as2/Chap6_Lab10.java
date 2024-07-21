package wku.ava.as2;

public class Chap6_Lab10 {

	public static void main(String[] args) {
		//Diamond
		//The top half part
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6 - i - 1; j++) {
				System.out.print(" ");
			}
			//When i = 0, (max)k = 1
			//It become an odd series
			for(int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
				try {
					Thread.sleep(100);
				}catch(InterruptedException f) {
					f.printStackTrace();
				}
			}
			System.out.println();
		}
		
		//The bottom half part
		for(int i = 5; i > 0; i--) {
		//When i = 0, j = 4
			for(int j = 0; j < 5 - i + 1; j++) {
				System.out.print(" ");
		//When i = 0, k = 1
			}for(int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
				try {
					Thread.sleep(100);
				}catch(InterruptedException f) {
					f.printStackTrace();
				}
			}
			System.out.println();
		}		
	}

}
