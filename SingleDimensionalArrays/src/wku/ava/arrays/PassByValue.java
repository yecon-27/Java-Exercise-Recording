package wku.ava.arrays;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 99;
		 
		System.out.println("Value before method call is " + number);
		changeNum(number);
		System.out.println("Value after method call is " + number);
		
	}
	public static int changeNum(int myValue) {
		myValue += 1;
		System.out.println("Pass by value inside method call is " + myValue);
		return myValue;
	}//Ye Cong 1306248
}
