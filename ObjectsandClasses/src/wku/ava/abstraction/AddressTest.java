package wku.ava.abstraction;
import java.util.Scanner;
public class AddressTest {
//Ye Cong 1306248
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address addr = new Address();
		
		System.out.println("Enter your street name: ");
		String street = sc.nextLine();
		addr.setStreetName(street);
		addr.getStreetName();
		
		System.out.println("Enter your city: ");
		String city = sc.nextLine();
		addr.setCity(city);
		addr.getCity();
		
		System.out.println("Enter your country: ");
		String country = sc.nextLine();
		addr.setCountry(country);
		addr.getCountry();
		
		System.out.println(addr.displayAddress());
		
		sc.close();

	}

}
