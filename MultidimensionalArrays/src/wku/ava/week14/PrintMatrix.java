package wku.ava.week14;

public class PrintMatrix {

	public static void main(String[] args) {
		int[][] matrix  = 
				{{1, 1, 0 ,-1},
				{2, 3, -1, -2},
				{3, 5 ,-9, 6}};
		System.out.println("The 3 x 4 matrix is: ");
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] < 0) 
				{
					matrix[i][j] = 0;
					System.out.print(matrix[i][j] + " ");
				}else 
				{
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
