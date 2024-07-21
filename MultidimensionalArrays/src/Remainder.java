
public class Remainder {

	public static void main(String[] args) {
		//check number of strings passed
		if (args.length != 3) {
			System.out.println("Invalid input.");
			System.exit(0);
		}


		//record the result '0' before calculating.
		int result = 0 ;

		//use Integer.parseInt method to turn all the strings into integers and execute the reminder
		if(args[1].equals("%")){
			result = Integer.parseInt(args[0]) % Integer.parseInt(args[2]);
		}

		//display result
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);

	}
}  