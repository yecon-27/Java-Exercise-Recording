package wku.ava.week7;

public abstract class Person{
	private String firstName;
	private String lastName;
	
	public Person() {}
	
	public Person(String first, String last) {
		firstName = first;
		firstName = last;
	}
	public void setFirstNAme(String first) {
		firstName = first;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastNAme(String last) {
			lastName = last;
	}
	public String getLastName() {
		return lastName;
	}
	//method definition
	public String displayName() {
		return firstName + " " + lastName;
	}
	//method declaration
	//an abstract method is no implmentation
	public abstract double pay();
	//implementation in the concrete class
}//end class Person

