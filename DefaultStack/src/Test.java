
public class Test {
	public static void main(String[] args) {
		int a = 1;
		double b = 2;
		int c = 3;
		System.out.println(func(a, b, c));
		//在main方法中,当我们调用func(a, b, c)时, java会尝试找到与abc参数类型匹配最具体的func方法
		//double比int更具体,func2最具体,因为他接受三个double类型的参数
		//由于a和c是int类型,而b是double类型,java会选择能够接受至少一个比double类型参数的方法
		//输出的结果是b的值
	}
	public static double func(int a, int b, int c) {
		return c;
	}
	public static double func(double a, double b, double c) {
		return b;
	}
	public static double func(double a, int b, double c) {
		return a;
	}
}
