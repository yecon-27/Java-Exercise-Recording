package wku.ava.week14;
//Interfaces
public interface DefaultStaticInterfaces {
	/*definition*/
	public default String greetings() {
		return "Java cps 2231 is fun!";
	}
	/*traditional interface method: method declaration*/
	public double divide(int a, int b);
}//end interface
