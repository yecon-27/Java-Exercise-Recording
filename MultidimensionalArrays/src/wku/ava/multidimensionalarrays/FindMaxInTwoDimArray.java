package wku.ava.multidimensionalarrays;

public class FindMaxInTwoDimArray {
	// use for classes
	static int max;
	static int row;
	static int col;
	public static void main(String[] args) {
		// in for loop, the matrix 's i start from the 0
		int[][] matrix = {{2, 4, 6, 18}, {44, 8, 3, 19},{9, 0 ,-2,552}, {5, 20, 4, 18}};
		max = matrix [0][0];
		System.out.println("Max is: " + max(matrix) + " in index" + "[" + row + "," + col + "]");
	}// end of the main
	public static int max(int[][] matrix) {
	for(int i = 0; i < matrix.length ; i++) {
		for(int j = 0; j < matrix[i]. length; j++ ) {
		if(matrix[i][j] > max) {
			max = matrix[i][j];
			row = i;
			col = j;
		}
		}
		}
		return max;
}// Ye Cong 1306248
}
