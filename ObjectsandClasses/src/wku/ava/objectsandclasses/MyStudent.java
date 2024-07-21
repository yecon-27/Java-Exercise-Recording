package wku.ava.objectsandclasses;

import wku.ava.abstraction.Address;

//Ye Cong 1306248
public class MyStudent {
	String name;
	int age;
	boolean isScienceMajor;
	char gender;
	//static String[] major = { """"""""};
	
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
	public void DisplayInfo(String name, int age, boolean isScienceMajor, char gender, Address addr) {
		System.out.println(name + " is " + age +" years old" + " Is the major science ? " + isScienceMajor + " Gender is " + gender);
	}
}// end class student

