package wku.ava.classes;
//Ye Cong 1306248
public class StackOfIntegersTest {

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();

		for(int i = 0; i < 10; i++) {
			stack.push(i);
		}
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
		System.out.println(stack.getSize());

}
}