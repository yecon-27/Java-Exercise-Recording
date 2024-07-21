package wku.ava.week14;
//Ye Cong 1306248
public class MyDefaultStaticTest {
//A concrete class
	public static void main(String[] args) {
		int x = 20, y = 5;
		MyDefaultStaticClass defstatic = new MyDefaultStaticClass();
		System.out.println(defstatic.greetings());
		System.out.println("Division is: " + defstatic.divide(x, y));
	}

}
