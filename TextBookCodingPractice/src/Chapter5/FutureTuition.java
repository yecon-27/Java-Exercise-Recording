package Chapter5;

public class FutureTuition {

	public static void main(String[] args) {
		double tuition = 10000;//Year 0
		int year = 0;
		while(tuition < 20000) {
			tuition = tuition * 1.07;
			year++;
		}
		/*The while loop (lines 5–8) is used to repeatedly compute the tuition for a new year. The 
		loop terminates when the tuition is greater than or equal to 20000.*/

		System.out.println("Tuition will be doubled in "
				+year + " years");
		System.out.printf("Tuition will be $%.2f in %1d years",
				tuition, year);
	}

}
