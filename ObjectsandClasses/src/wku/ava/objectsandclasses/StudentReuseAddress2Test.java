package wku.ava.objectsandclasses;
import java.util.Scanner;
import wku.ava.abstraction.Address2;
//Ye Cong 1306248
public class StudentReuseAddress2Test {
	
	public static void main(String[] args) {
		Address2 addr = new Address2();
		StudentReuseAddress2 sra2 = new StudentReuseAddress2();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name = kb.next();
		
		System.out.println("Enter your age ");
		int age = kb.nextInt();
		
		System.out.println("Enter your major e.g. CPS ");
		String scienceMajor = kb.next();
		
		System.out.println("Enter your gender ");
		char gender = kb.next().charAt(0);//method-chainning, when method are tight together
		
		System.out.println("Enter your house number: ");
		int houseNum = kb.nextInt();
		addr.setHouseNum(houseNum);
		addr.getHouseNum();
		//为了消耗掉换行符,可以在调用其他nextxx()后加上kb.nextLine();
		kb.nextLine();
		
		System.out.println("Enter your full address e.g. street, city, counrty: ");
		String fullAddress = kb.nextLine();
		addr.setFullAddress(fullAddress);
		addr.getfullAddress();
		
		boolean isScienceMajor = sra2.isScienceMajor(scienceMajor);
		
		sra2.DisplayInfo(name, age, isScienceMajor, gender, addr);
		
		kb.close();

	}

}
