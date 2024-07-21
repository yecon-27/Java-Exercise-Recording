
public class RaggedArray1 {

	public static void main(String[] args) {
		 int[][] array = new int[5][6];
		 int[] x = {1, 2};
		 array[0] = x;
		 System.out.println("Array after changing is ");
		 
		 for(int i = 0; i < array.length; i++) {
			 for(int j = 0; j < array[i].length ; j++) {
				 System.out.print(array[i][j]+ " ");
			 }
			 System.out.println();
		 }
	}
}
