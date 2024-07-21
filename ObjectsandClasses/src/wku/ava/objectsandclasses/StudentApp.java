package wku.ava.objectsandclasses;
import java.util.Scanner;
import wku.ava.abstraction.Address;
public class StudentApp {
//Ye Cong 1306248
	public static void main(String[] args) {
		Student student = new Student();
		Address addr;
		Scanner kb = new Scanner(System.in);
		
		//the method to input from the keyboard is : next ,nextInt
		System.out.println("Enter your name ");
		String name = kb.next();
		
		System.out.println("Enter your age ");
		int age = kb.nextInt();
		kb.nextLine();//discard input
		
		System.out.println("Enter your major e.g. CPS ");
		String scienceMajor = kb.nextLine();
		
		System.out.println("Enter your gender ");
		char gender = kb.next().charAt(0);//method-chainning, when method are tight together
		
		System.out.println("Enter your street Name");
		String streetName = kb.next();
		
		System.out.println("Enter your city ");
		String city = kb.next();
		
		System.out.println("Enter your country ");
		String country = kb.next();
		
		boolean isScienceMajor = student.isScienceMajor(scienceMajor);
		addr = new Address(streetName, city, country);
		
		student.DisplayInfo(name, age, isScienceMajor, gender, addr);
		System.out.println();
		
		kb.close();
	}
//Ye Cong 1306248
}
