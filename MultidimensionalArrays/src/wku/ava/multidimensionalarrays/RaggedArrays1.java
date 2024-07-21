package wku.ava.multidimensionalarrays;

public class RaggedArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1, 2, 3, 4, 5},
				{2, 3, 4, 5},
				{3, 4, 5},
				{4, 5},
				{5}	
		};
		System.out.println("Rows = " + matrix.length);
		System.out.println("Colomn in first row = " + matrix[0].length);
		System.out.println("Colomn in last row = " + matrix[4].length);
		matrix = multiplyElement(matrix);
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] multiplyElement(int[][] arr){
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr [i][j] = arr[i][j];
			}
	}
		return arr;
	}//Ye Cong 1306248
}
