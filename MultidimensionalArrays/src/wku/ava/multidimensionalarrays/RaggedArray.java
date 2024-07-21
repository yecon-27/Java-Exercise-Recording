package wku.ava.multidimensionalarrays;

public class RaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
				{2, 1, 4},
				{1, 2, 3, 1},
				{3, 1, 2}
		};
		System.out.println("Rows = " + matrix.length);
		System.out.println("Colomns in first row = " + matrix[0].length);
		matrix = multiplyElement(matrix);
		System.out.println("The number of columns in second row:" + matrix[1].length);
		
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
	//Multiply each columns by a scalar
				arr[i][j] = arr[i][j] * 2;
			}
		}
		return arr;
	}
//Ye Cong 1306248

	}

