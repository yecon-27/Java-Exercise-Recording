
public class IntegerLiteral {
	public static void main(String[] args) {
//这里的ssn变量被声明为long类型，而数字232_45_4519使用了下划线分隔符。尽管这个数字没有后缀L，但由于它超过了int类型的最大值（2,147,483,647），编译器会将其识别为long类型的字面量。在Java 7及以后的版本中，当一个整数字面量超出了int的范围时，即使没有L后缀，它也会被自动视为long类型。
//所以，即使没有L后缀，使用下划线分隔的数字（如232_45_4519）在Java中仍然可以正确地表示为long类型，前提是它们不能表示为int类型。这种语法糖使得长数字的书写和阅读更为方便。
		long ssn = 232_45_4519L;
		long creditCardNumber = 2324_4545_4519_3415L;
		System.out.println(ssn);
		System.out.println(creditCardNumber);
	}
}
