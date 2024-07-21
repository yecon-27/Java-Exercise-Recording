package wku.ava.com;
//Ye Cong 1306248
public class ChangeValuesInAnArray {
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford"};
		//display the original array cars:
		System.out.println("The original cars array is:");
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}//end of the for loop
		System.out.println();
		
		//change the value from "Volvo" to "Opel", in the cars array
		cars[0] = "Opel";
		//print the result after changing
		System.out.println("The first value in cars array after changing is: " + cars[0]);
	}//end of the main
}//end of the class
