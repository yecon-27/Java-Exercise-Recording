package wku.ava.wrapperclasses;
//Ye Cong 1306248
import java.math.BigInteger;

public class BigIntegerTest {

	public static void main(String[] args) {
		BigInteger a = new BigInteger("9223372036854775807");
		BigInteger b = new BigInteger("123456789");
		BigInteger c = a.multiply(b);
		System.out.println(c);//1138687895422480280447103723
		System.out.println(a.compareTo(c));//-1
	}

}
