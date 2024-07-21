package wku.ava.multidimensionalarrays;

import java.util.Scanner;

public class ReturningOutput {

	public static void main(String[] args) {
		int[][] matrix = new int[3][4];
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
			output(matrix);
			System.out.println("End of input");
	}
	public static void output(int[][] matrix) {
		try(Scanner sc = new Scanner(System.in)){
		for(int row = 0; row < matrix.length ; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = sc.nextInt();
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		}//Ye Cong 1306248
	}
}
