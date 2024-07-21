package wku.ava.com;
//Ye Cong 1306248
public class TwoDimensionalArrayInitializer {
	public static void main(String[] args) {
		//Create an two-dimensional array of type String called myNumbers, using Array initializers:
		/*elementType[][] arrayRefVar = {{value 0, value 1, ..., value k},..., {value 0, value 1, ..., value m}};*/
		int[][] myNumbers = {{1, 2, 3, 4}, 
							{5, 6, 7}};//jagged/ragged array
		//display the array cars:
		for(int i = 0; i < myNumbers.length; i++) {
			for(int j = 0 ; j < myNumbers[i].length; j++) {
			System.out.print(myNumbers[i][j] + " ");
			}
			System.out.println();//New line after each row
			}//end of the for loop
		
	}//end of the main
}//end of the class
