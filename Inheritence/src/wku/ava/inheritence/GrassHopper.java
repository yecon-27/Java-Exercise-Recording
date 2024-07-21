package wku.ava.inheritence;

public class GrassHopper extends Insect{
	
	public GrassHopper(int wing, int leg) {
		super(wing, leg);//inherited property first// very important personality
	}
	public String toString() {
		return super.toString();//Insect.toString()//When you meet super, you meet super class
	}
	public String jump() {
		return "It can jump.";
	}
}
