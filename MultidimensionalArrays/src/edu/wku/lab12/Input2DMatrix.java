package edu.wku.lab12;
import java.util.Scanner;
public class Input2DMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] array1 = new int[4][5];
		int[][] array2 = new int[4][5];
		int[][] productArray = new int[4][5];
		System.out.println("Please enter the element of matrix A(Split each with blanck spaces)");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = input.nextInt();
			}
		}
		System.out.println("Please enter the element of matrix B(Split each with blanck spaces)");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = input.nextInt();
			}
		}
		input.close();
		System.out.println("The matrix C(C = 3A + 2B) is = ");
		for (int i = 0; i < productArray.length; i++) {
			for (int j = 0; j < productArray[i].length; j++) {
				productArray[i][j] = 3 * array1[i][j] + 2 * array2[i][j];
				System.out.print(productArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
