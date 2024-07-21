package week12;

public class MyFullStackException extends Exception{
	private String error;
	//Construct an exception
	public MyFullStackException (String error) {
		this.error = error;
	}
	public String toString() {
		return error;
	}
}//end class
