package wku.ava.inheritence;

public class Animal {
	private String modeOfMovement;
    
    public Animal() {
    }
    public Animal(String modeOfMovement) {
    	this.modeOfMovement = modeOfMovement;
    }
    
//Create a getter and setter method to fetch the property
	public String getModeOfMovement() {
		return modeOfMovement;
	}

	public void setModeOfMovement(String modeOfMovement) {
		this.modeOfMovement = modeOfMovement;
	}
	public void move() {
	       System.out.println("This animal can move by " + modeOfMovement);
	    }
}
