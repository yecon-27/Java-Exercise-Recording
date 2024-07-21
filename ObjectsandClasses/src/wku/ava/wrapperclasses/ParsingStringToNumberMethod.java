package wku.ava.wrapperclasses;
//Ye Cong 1306248
public class ParsingStringToNumberMethod {

	public static void main(String[] args) {
		int x = Integer.parseInt("11", 2);
		System.out.println(x);
		
		int y = Integer.parseInt("12", 8);
		System.out.println(y);
		
		int z = Integer.parseInt("13", 10);
		System.out.println(z);
		
		int p = Integer.parseInt("1A", 16);
		System.out.println(p);
		
		int q = Integer.parseInt("11101", 2);
		System.out.println(q);
	}

}
