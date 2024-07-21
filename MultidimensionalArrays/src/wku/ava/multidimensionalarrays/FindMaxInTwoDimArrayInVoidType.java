package wku.ava.multidimensionalarrays;

public class FindMaxInTwoDimArrayInVoidType {
	// use for classes
	static int max;
	static int row;
	static int col;
	public static void main(String[] args) {
		// in for loop, the matrix 's i start from the 0
		int[][] matrix = {{2, 4, 6, 18}, {44, 8, 3, 19},{9, 0 ,-2,552}, {5, 20, 4, 18}};
		max = matrix [0][0];
		//不调用的话就没有结果
		max(matrix);
		
	}// end of the main
	public static void max(int[][] matrix) {
	for(int i = 0; i < matrix.length ; i++) {
		for(int j = 0; j < matrix[i]. length; j++ ) {
		if(matrix[i][j] > max) {
			max = matrix[i][j];
			row = i;
			col = j;
		}
	}
}
	System.out.println("Max is: " + max + " in index" + "[" + row + "," + col + "]");
}// Ye Cong 1306248
}
