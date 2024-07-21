package wku.ava.multidimensionalarrays;

public class SummingElementByColomn {

	public static void main(String[] args) {
		int[][] matrix = {
				{2, 1, 4, 2},
				{1, 2, 3, 1},
				{3, 1, 2, 2}	
		};
		for(int column = 0; column < matrix[0].length; column++) {
			int total = 0;
		 for(int row = 0; row < matrix.length; row++) 
			total += matrix[row][column];
		 System.out.println("Sum for column"+column+ " is " +total);	
		
		}
		
//Ye Cong 1306248
}
}