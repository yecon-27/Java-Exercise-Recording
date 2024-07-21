package wku.ava.as1;
//Ye Cong 130624
import java.util.Scanner;
public class SortingTwoCities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt user to enter 2 cities
		System.out.println("Enter the first city: ");
		String city1 = input.nextLine();
		
		System.out.println("Enter the second city: ");
		String city2 = input.nextLine();
	
		input.close();
		//reorder the cities names according to alphabetical order using suitable string functions. 
		if(city1.compareTo(city2) < 0)
			System.out.println("The cities in alphabetical order are "
					+ city1 + " " + city2);
		else
			System.out.println("The cities in alphabetical order are "
					+ city2 + " " + city1);
	}

}


