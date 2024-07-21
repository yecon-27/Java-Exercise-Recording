package wku.ava.as2;
//Key: Modify the control variable in different cases
//i(in the outer loop): represent the row number, control the iteration time 
//j(in the inner loop): represent the line number
//j may depends on i if you want to print a triangle
/*It is recommended to initialize the initial value to be 1,
then you can use equal symbol and avoid using -1 in the loop-continuation-condition to Increase the readability of the code*/

/*When it comes to triangle align right, you should divide it into 2 parts*/
public class Chap5_Lab5 {

	public static void main(String[] args) {
		//Square Fill Pattern: the inner control variable has the same range scope with the outer control variable
		for (int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				System.out.print("*");
				try {
					Thread.sleep(70);
				}catch(InterruptedException f) {
					f.printStackTrace();
				}
			}//Move to the next line after each level is printed
			System.out.println();
		}
		
		//Right Half Pyramid(Align Left): The inner control variable depends on the the outer control variable in positive correlation 
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				try {
					Thread.sleep(70);
				}catch(InterruptedException f) {
					f.printStackTrace();
				}
			}
			System.out.println();
		}
		
		//Reverse Right Half Pyramid(Align Left): The inner control variable depends on the outer control variable in negative correlation
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {//5 times, 4 times, 3 times, 2 times, 1time
				System.out.print("*");
				try {
					Thread.sleep(70);
				}catch(InterruptedException f) {
					f.printStackTrace();
				}
			}
			System.out.println();
		}
		
		/*
		Left Half Pyramid(Align Right):Reversed Right Half Pyramid(Align Left) + Left Half Pyramid(Align Right)
		In Reversed Right Half Pyramid(Align Left), the inner control variable have a negative correlation with the outer control variable
		In Left Half Pyramid(Align Right), The inner control variable have a positive correlation with the outer variable
		They share the same outer control variable 
		*/
		/*for(int j = 1; j <= 5; j++) {
		
		if(j <= 5 - i) {
			System.out.print(" ");
		}else
			System.out.print("*");//Since the sequence is single-order, so only use one if-else statement
		try {
			Thread.sleep(70);
		}catch(InterruptedException f) {
			f.printStackTrace();
		}*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) //First line have 4 spaces
				System.out.print(" ");
			for (int j = i; j >= 1; j--)//First line have 1 *
				System.out.print("*");
			try {
					Thread.sleep(70);
				}catch(InterruptedException f) {
					f.printStackTrace();
				}
			
			System.out.println();
		}
		
		/*
		 Reverse Left Pyramid: Right Half Pyramid(Align Left) + Reversed Left Half Pyramid(Align Right)
		 In Right Half Pyramid, the inner control variable has a positive correlation with the outer control variable
		 In Reversed Left Half Pyramid, the inner control variable has a negative correlation with the inner control variable
		 */
		/*if(j > i) {
					System.out.print("*");
					try {
						Thread.sleep(70);
					}catch(InterruptedException f) {
						f.printStackTrace();
					}
				}else
					System.out.print(" ");
		*/
			
		
		for (int i = 1; i <= 5 ; i++) {
			for(int j = 1; j < i; j++)
				System.out.print(" ");
			for(int j = i; j <= 5; j++)
				System.out.print("*");
			try {
					Thread.sleep(70);
				}catch(InterruptedException f) {
					f.printStackTrace();
				}
			System.out.println();
		}
}		
}
//end of the class
