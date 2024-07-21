package wku.ava.multidimensionalarrays;

public class SummingArrays {

	public static void main(String[] args) {
		//1.Initializing myArray
		int[][] matrix = {
				{2, 1, 4, 2},
				{1, 2, 3, 1},
				{3, 1, 2, 2}	
		};
		int sum = 0;
		//2.Running nested for loops
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
		//3.Summing up the elements
				sum += matrix[i][j];
				
			}
		}
		System.out.print(sum);
	}//end method main
//Ye Cong 1306248
}// end class
