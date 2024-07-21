package wku.ava.week13;
//Ye Cong 1306248
//actual class
public class MyCalculateNumber implements CalculateNumber {
	public int add (int x, int y) {
		return x + y;
	}
	public int subtract (int x, int y) {
		return x - y;
	}
	public int multiply (int x, int y) {
		return x * y;
	}
	public int square (int x) {
		return x * x;
	}
	public int divide (int x, int y) {
		return x / x;
	}
	public int modulo(int x, int y) {
		return x * y;
	}
}
