package wku.ava.inheritence;

public class Dog extends Animal{
	private int legs;
	public Dog() {};
	public Dog(String modeOfMovement, int legs) {
		super(modeOfMovement);
		this.legs = legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getLegs() {
		return legs;
	}
	@Override
	public void move() {
		System.out.println("with " + legs + " legs");
	}
}
