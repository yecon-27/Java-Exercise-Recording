package wku.ava.multidimensionalarrays;
import java.util.Scanner;
public class InputTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[][] matrix = new int[3][4];
		System.out.println("Enter: " + matrix.length + " rows and " + matrix[0].length + " colomns: ");// 1 0 6 7// 2 6 6 2// 5 2 3 4
		
		for(int row = 0; row < matrix.length; row++) {
			for(int colomn = 0; colomn < matrix[row].length; colomn++) {
				matrix[row][colomn] = input. nextInt();
				System.out.print(matrix[row][colomn] + " ");
				
			}
			System.out.println();
		}
		input.close();
		System.out.println("End of input");
	}
// Ye Cong 1306248
}
