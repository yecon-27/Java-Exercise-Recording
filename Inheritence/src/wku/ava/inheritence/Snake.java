package wku.ava.inheritence;

public class Snake extends Animal{
	String belly;
	public Snake() {
    }
	public Snake(String modeOfMovement, String belly) {
		super(modeOfMovement);
		this.belly = belly;
	}
	public void setBelly(String belly) {
		this.belly = belly;
	}
	public String getBelly() {
		return belly;
	}
	@Override
    public void move() {
       System.out.print("with its belly.");
    }
}
