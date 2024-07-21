package wku.ava.week13;
//Ye Cong 1306248
public class MyCalculateNumberTest {

	public static void main(String[] args) {
		int x = 8, y = 4;
		MyCalculateNumber calNum = new MyCalculateNumber();
		System.out.println("Addition is: " + calNum.add(x, y));
		System.out.println("Subtraction is: " + calNum.subtract(x, y));
		System.out.println("Multiplication is: " + calNum.multiply(x, y));
		System.out.println("Square is: " + calNum.square(x));
		System.out.println("Division is: " + calNum.divide(x, y));
		System.out.println("Remainder is: " + calNum.modulo(x, y));
		

	}

}
