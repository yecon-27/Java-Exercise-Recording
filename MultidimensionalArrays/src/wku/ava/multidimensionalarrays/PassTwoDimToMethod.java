package wku.ava.multidimensionalarrays;

public class PassTwoDimToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{2, 1, 4, 2}, {1, 2, 3, 1},{3, 1, 2, 2}};
		divideElement(matrix);
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] divideElement(int[][] arr){
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = arr[i][j] / 2;
			}
		}
		return arr;//void you did not need return method//return: it tell the method come back to main and tell  you are finish// void :don't come back
	}
}// Ye Cong 1306248
