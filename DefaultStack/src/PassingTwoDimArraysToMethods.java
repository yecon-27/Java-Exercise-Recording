
public class PassingTwoDimArraysToMethods {

	public static void main(String[] args) {
		
			 int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
			    System.out.println(m1(array)[0]);
			    System.out.println(m1(array)[1]);
			  }
			 public static int[] m1(int[][] m) {
			 int[] result = new int[2];
			    result[0] = m.length;
			    result[1] = m[0].length;
			 return result;
			  }
	}
// print the numbers of rows and columns
