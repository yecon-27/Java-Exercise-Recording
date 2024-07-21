package wku.ava.week7;
import java.util.Scanner;
public class Ch4_Method5_TwoCIties {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt user to enter 2 cities
		System.out.println("Enter the first city: ");
		String city1 = input.nextLine();
		
		System.out.println("Enter the first city: ");
		String city2 = input.nextLine();
	
		input.close();
		//
		if(city1.compareTo(city2) < 0)
			System.out.println("The cities in alphabetical order are "
					+ city1 + " " + city2);
		else
			System.out.println("The cities in alphabetical order are "
					+ city2 + " " + city1);
	}
}


