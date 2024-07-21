package wku.ava.abstraction;
//Ye Cong 1306248//lab6
import java.util.Scanner;

public class Address2Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address2 addr = new Address2();
		
		System.out.println("Enter your full address e.g. street, city, counrty: ");
		String fullAddress = sc.nextLine();
		addr.setFullAddress(fullAddress);
		addr.getfullAddress();
		
		System.out.println("Enter your house number: ");
		int houseNum = sc.nextInt();
		addr.setHouseNum(houseNum);
		addr.getHouseNum();
		
		System.out.println(addr.displayAddress());
		sc.close();
	}

}
