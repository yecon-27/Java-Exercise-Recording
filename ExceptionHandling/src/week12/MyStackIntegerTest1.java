package week12;

public class MyStackIntegerTest1 {

	public static void main(String[] args) {
		MyStackOfIntegers1 stack = new MyStackOfIntegers1();

		for (int i = 0; i < 6; i++) {
			try {
				stack.push(i);
			}catch (MyFullStackException e){
				//e.printStackTrace();
				System.out.println(e);
			}
		}
		System.out.println("Stack size is " + stack.getSize());
	
		for (int i = 0; i < 6; i++) {
			try {
				stack.pop(i);
	            }
			catch (MyStackEmptyException e) {
				e.printStackTrace();
			}
			}
	   System.out.print("Stack size is " + stack.getSize());
	  
	

}
	}