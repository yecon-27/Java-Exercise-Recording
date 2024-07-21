package wku.ava.objectsandclasses;
import wku.ava.abstraction.Address;

public class Student {
	String name;
	int age;
	boolean isScienceMajor;
	char gender;
	double weight;
	Address address;
	
	public Student() {
	}
	public boolean isScienceMajor(String major) {
		if(major.equals("CPS")) {
			isScienceMajor = true;
			System.out.println("You are science major");
			return isScienceMajor;// return true
		}
		else {
			isScienceMajor = false;
			System.out.println("You are not science major");
			return isScienceMajor;// return false
		}
	}
	public void DisplayInfo(String name, int age, boolean isScienceMAjor, char gender, Address addr) {
		System.out.println(name + " is " + age + " years old. " + " is the major science ? " + 
									isScienceMajor + ". Gender is " + gender + "\n" +
									"Address is: " + addr.displayAddress());
	}
}//Ye Cong 1306248

