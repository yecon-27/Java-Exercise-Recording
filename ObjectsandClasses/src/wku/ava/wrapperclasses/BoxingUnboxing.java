package wku.ava.wrapperclasses;
//Ye Cong 1306248
public class BoxingUnboxing {

	public static void main(String[] args) {
		int x = 5;
		Integer intObject = new Integer(x);
		System.out.println(intObject + 7);
		
		Integer y = 3 + new Integer(5);//autoboxing of 5
		System.out.println(y);
		
		Integer[] intArr = {3, 1, 9, 5, 2};
		System.out.println(intArr[0] + ", " + intArr[3]);
		}
	}


