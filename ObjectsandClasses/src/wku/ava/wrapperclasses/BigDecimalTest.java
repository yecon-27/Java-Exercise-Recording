package wku.ava.wrapperclasses;
import java.math.BigDecimal;
public class BigDecimalTest {
//Te Cong 1306248
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal(1.0);
		BigDecimal b = new BigDecimal(3);
		BigDecimal c = a.divide(b, 40, BigDecimal.ROUND_UP);//round up to 40 d.p.
		System.out.println(c);

	}

}
