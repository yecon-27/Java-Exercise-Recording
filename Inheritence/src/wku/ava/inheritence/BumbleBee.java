package wku.ava.inheritence;
//Ye Cong 1306248
public class BumbleBee extends Insect{
	private int stinger;
	
	public BumbleBee() {
	}
	public BumbleBee(int wing, int leg, int stinger) {
		super(wing, leg);//inherited property first// very important personality
		this.stinger = stinger;
	}
	public void setStinger(int stinger) {
		this.stinger = stinger;
	}
	public int getStinger() {
		return stinger;
	}
	public String stings() {
		return "Hurts with " + stinger + " stinger. ";
	}
	public String toString() {
		return super.toString();//Insect.toString()//When you meet super, you meet super class
	}
}
