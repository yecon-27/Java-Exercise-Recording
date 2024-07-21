
public class GenerateARandomLetter {

	public static void main(String[] args) {
		//'a',将其偏移到正确的结果
		//我们将这个随机数乘以 `(max - min + 1)`，这样就可以得到一个介于 0 到 `(max - min + 1)` 之间的随机数。
		//这里是用了typecasting to Integer
		//Inclusive Boundaries
		char randomLetter = (char) ('a' + Math.random() * ('z' - 'a' + 1));
        System.out.println("Random lowercase letter: " + randomLetter);

	}

}
