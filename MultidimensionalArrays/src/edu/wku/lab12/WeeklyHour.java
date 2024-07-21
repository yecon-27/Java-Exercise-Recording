package edu.wku.lab12;
import java.util.Scanner;
public class WeeklyHour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the elements of Employee's working hour");
		int[][] workHour = new int[8][7];
		for (int i = 0; i < workHour.length; i++) {
			for (int j = 0; j < workHour[0].length; j++) {
				workHour[i][j] = input.nextInt();
			}
		}
		input.close();
		
		System.out.println("\nOriginal 2D Array:");
        print2DArray(workHour);

        // Sort the array based on the sum of rows
        sortRowsBySum(workHour);

        System.out.println("\nSorted 2D Array by Row Sum:");
        print2DArray(workHour);
    }

    public static void sortRowsBySum(int[][] array2D) {
        int numRows = array2D.length;
        for (int i = 0; i < numRows - 1; i++) {
            // Assume the first row has the maximum sum
            int maxRow = i;
            for (int j = i + 1; j < numRows; j++) {
                // Compare the sum of rows to find the maximum
                if (getRowSum(array2D[j]) > getRowSum(array2D[maxRow])) {
                    maxRow = j;
                }
            }
            // Swap the rows if necessary
            if (maxRow != i) {
                swapRows(array2D, i, maxRow);
            }
        }
    }	

    private static int getRowSum(int[] row) {
        int sum = 0;
        for (int value : row) {
            sum += value;
        }
        return sum;
    }

    private static void swapRows(int[][] array2D, int row1, int row2) {
        int[] temp = array2D[row1];
        array2D[row1] = array2D[row2];
        array2D[row2] = temp;
    }

    public static void print2DArray(int[][] array2D) {
        for (int[] row : array2D) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    
	
}
}