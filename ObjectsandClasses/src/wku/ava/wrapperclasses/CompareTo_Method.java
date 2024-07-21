package wku.ava.wrapperclasses;
//Ye Cong 1306248
public class CompareTo_Method {

	public static void main(String[] args) {
		int x = new Double(12.4).compareTo(new Double(12.3));
		System.out.println(x);
		
		int y = new Double(12.3).compareTo(new Double(12.3));
		System.out.println(y);
		
		int z = new Double(12.3).compareTo(new Double(12.51));
		System.out.println(z);
		
		System.out.println(new Double(12.4).compareTo(new Double(12.3)));
	}

}
