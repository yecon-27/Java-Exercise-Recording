package Chapter5;

public class TestSumInDouble {
//A double variable holds 64 bits, whereas the float variable holds 32 bits
	public static void main(String[] args) {
		//double sum = 0;
		//for(double i = 0.01; i < 1.0 ; i = i + 0.01)
		//	sum += i;
		//Display the result: 49.500000000000003(14 after decimal)
		/*If you display i for each iteration in the loop, you will see that the last i is slightly 
		larger than 1 (not exactly 1). This causes the last i not to be added into sum. The fundamental 
		problem is the floating-point numbers are represented by approximation. To fix the problem, 
		use an integer count to ensure all the numbers are added to sum. */
		
		//System.out.println(sum);
		
		//To fix the problem, use following program
		double currentValue = 0.01;
		double sum = 0;
		for (int count = 0; count < 100; count++) {
		 sum += currentValue;
		 currentValue += 0.01;
		}//Display the result: 50.50000000000003
		System.out.println(sum);
	}

}
