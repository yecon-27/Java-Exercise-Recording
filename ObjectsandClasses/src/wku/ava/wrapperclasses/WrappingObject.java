package wku.ava.wrapperclasses;
//Ye Cong 1306248
public class WrappingObject {
//Concatenation: they are not computed
	public static void main(String[] args) {
		//primitive int to corresponding Integer object
		Integer intToObject = new Integer(7);
		System.out.println("Primetive int into Intger object: " + intToObject + 5);
		
		//numeric string to corresponding integer object
		Integer numericStringToObject = new Integer("7");
		System.out.println("Primetive int into Intger object: " + numericStringToObject + 4);
		
		//primitive double to corresponding Integer object
		Double doubleToObject = new Double(7.5);
		System.out.println("Primetive int into Double object: " + doubleToObject + 3);
		
		////numeric double string to corresponding integer object
		Double numericDoubleStringToObject = new Double("7.5");
		System.out.println("Primetive int into Double object: " + numericDoubleStringToObject + 9);
	}

}//end method main
