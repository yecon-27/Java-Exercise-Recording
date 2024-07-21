package wku.ava.inheritence;
//Ye Cong 1306248
public class Fish extends Animal {
	private int fins;
	
	public Fish() {}
	
	public Fish(String modeOfMovement, int fins) {
		super(modeOfMovement);
		this.fins = fins;
	}
	public void setFins(int fins) {
		this.fins = fins;
	}
	public int getFins() {
		return fins;
	}
	
	@Override
	public void move() {
		System.out.print("with " + fins + " fins.");
}
}