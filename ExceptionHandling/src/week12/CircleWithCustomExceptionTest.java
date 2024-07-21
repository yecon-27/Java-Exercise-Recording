package week12;

public class CircleWithCustomExceptionTest {

	public static void main(String[] args) {
		try {
			new CircleWithCustomException(5);//detect the exception, it will go and find the solution, and terminate other exceution
			new CircleWithCustomException(-5);
			//When it detects exception, it will turn to the catch block and terminate the try block
			new CircleWithCustomException(0);
			new CircleWithCustomException(7);
		}
		catch (InvalidRadiusException ex) {
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created: " +
				CircleWithCustomException.getNumberOfObjects());
	}

}
