package wku.ava.multidimensionalarrays;

public class TwoDimArrayRandomInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[3][4];
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 10);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
// Ye Cong 1306248
}
