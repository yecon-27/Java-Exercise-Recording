package week12;

public class MyStackEmptyException extends Exception{
	private String error;
	//Construct an exception
	public MyStackEmptyException() {
		
	}
	public MyStackEmptyException (String error) {
		this.error = error;
	}
	public String toString() {
		return error;
}
}