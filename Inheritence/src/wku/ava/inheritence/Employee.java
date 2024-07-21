package wku.ava.inheritence;

public class Employee extends Person{
	private int hours;
	private double rate;
	
	public Employee() {}
	//You must declare inherited/superclass's property first
	public Employee(String first, String last, int hrs, double myRate) {
		super(first,last);
		hours = hrs;
		rate = myRate;
}
	public void setHours(int hrs) {
		hours = hrs;
	}
	public int getHours() {
		return hours;
	}
	public void setMyRate(double myRate) {
		myRate = rate;
	}
	public double getMyRate() {
		return rate;
	}
	@Override
	public double pay() {
		return hours * rate;
	}
	//Calling the displayName() of the superclass
	//if you like you can also @Override it
	public String toString() {
		return super.displayName() + " weekly pay is " + pay();
	}
}