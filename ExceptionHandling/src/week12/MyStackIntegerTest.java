package week12;

public class MyStackIntegerTest {

	public static void main(String[] args) {
		MyStackOfIntegers stack = new MyStackOfIntegers();

		for (int i = 0; i < 6; i++) {
			try {
				stack.push(i);
			}catch (MyFullStackException e){
				//e.printStackTrace();
				System.out.println(e);
			}
		}
		System.out.println("Stack size is " + stack.getSize());
	
	while (!stack.empty()) {
		System.out.println(stack.pop() + " ");
	}
	System.out.print("Stack size is " + stack.getSize());
}
}