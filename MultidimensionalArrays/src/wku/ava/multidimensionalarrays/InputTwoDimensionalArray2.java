package wku.ava.multidimensionalarrays;
import java.util.Scanner;
public class InputTwoDimensionalArray2 {
	//static: come before the main , it is available to all the program, outside any scope
	static int[][] matrix = new int[3][4];
	static Scanner input; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		System.out.println("Enter: " + matrix.length + " rows and " + matrix[0].length + " colomns: ");// 1 0 6 7// 2 6 6 2// 5 2 3 4
		displayMatrix();//method call//bracket, parameter right
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
				}
			System.out.println();
			}
		}
	public static int[][] displayMatrix() {
		for (int row = 0; row < matrix.length; row++) {
			for(int colomn = 0; colomn < matrix[row].length; colomn++) {
				matrix[row][colomn] = input.nextInt();
			}
		}
	//You cannot put it after the return statement;behind the return statement cannot be same
		input.close();
		System.out.println("End of input");
		return matrix;
	}
// Ye Cong 1306248
}
