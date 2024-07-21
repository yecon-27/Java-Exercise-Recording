package wku.ava.inheritence;
//Ye Cong 1306248
public class Insect {
	private int wing;
	private int leg;
	
	public Insect() {
	}
	public Insect(int wing, int leg) {
		this.wing = wing;
		this.leg = leg;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	public int getWing() {
		return  wing;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getLeg() {
		return leg;
	}
	public String toString() {
		return "Moves with " + leg + " legs. \n" + 
				"And flys with " + wing + " wings. ";
	}
}
