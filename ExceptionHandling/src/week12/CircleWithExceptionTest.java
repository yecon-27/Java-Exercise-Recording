package week12;

public class CircleWithExceptionTest {

	public static void main(String[] args) {
		try {
			CircleWithException cir1 = new CircleWithException(5);//detect the exception, it will go and find the solution, and terminate other exceution
			CircleWithException cir2 = new CircleWithException(-5);
			//When it detects exception, it will turn to the catch block and terminate the try block
			CircleWithException cir3 = new CircleWithException(0);
		}
		catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created: " +
				CircleWithException.getNumberOfObject());
		

	}

}
