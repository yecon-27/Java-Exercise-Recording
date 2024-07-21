package week12;
//Ye Cong 1302648
public class MyExceptionApp {

	public static void main(String[] args) {
		MyExceptionImplementation exception = new MyExceptionImplementation();
		try {
			String test = exception.showNumber(5);
			System.out.println(test);
		}catch(MyException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("The finally block always print whether excpetion is thrown or not." );
		}
	}

}
