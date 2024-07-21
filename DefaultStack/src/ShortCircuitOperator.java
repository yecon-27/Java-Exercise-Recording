
public class ShortCircuitOperator {

	public static void main(String[] args) {
		int x = 1;
		System.out.println((x != 1) == !(x == 1));

	}

}
