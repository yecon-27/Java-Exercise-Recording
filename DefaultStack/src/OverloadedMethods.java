
public class OverloadedMethods {
	public static void  main(String[] args) {
		
		double n = 5;
		System.out.println(add(n));		
	} 
	public static int add(int x) {
		return x;
	}
	
	public static int add(int x, int y) {
		return y;
	}

	public static double add(double d) {
		return d;
	}
	
	public static double add(double d, double f) {
		return f;
	}
	
}
