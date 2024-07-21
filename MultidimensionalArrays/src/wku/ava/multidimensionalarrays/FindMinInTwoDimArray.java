package wku.ava.multidimensionalarrays;

public class FindMinInTwoDimArray {
	// use for every classes
	static int min;
	static int row;
	static int col;
	public static void main(String[] args) {
		// in for loop, the matrix 's i start from the 0
		int[][] matrix = {{2, 4, 6, 8, -199}, {7, 5, 3},{9, 0 ,-2, 2}};
		min = matrix [0][0];
		System.out.println("Min is: " + min(matrix) + " in index" + "[" + row + "," + col + "]");
	}// end of the main
	
	public static int min(int[][] matrix) {
	for(int i = 0; i < matrix.length ; i++) {
		for(int j = 0; j < matrix[i]. length; j++ ) {
		if(matrix[i][j] < min) {
			min = matrix[i][j];
			row = i;
			col = j;
		}
		}
		}// return statement give back only a single value, if you try to add , row , col
	//it cannot return separate value
	//use static keyword is very helpful since row and colomn will be updated
		return min;
}// Ye Cong 1306248
}
