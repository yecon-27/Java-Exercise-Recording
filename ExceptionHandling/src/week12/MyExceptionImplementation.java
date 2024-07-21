package week12;

public class MyExceptionImplementation {
	public String showNumber (int i) throws MyException {
		if (i == 0) {
			throw new MyException ("Zero is not allowed...");
		}
		else {
			return "Thanks, number greater than zero";
		}
	}
}
