package wku.ava.inheritence;
//Ye Cong 1306248
public class Birds extends Animal{
	 private int wings;
	 public Birds() {
	    }
	 public Birds(String modeOfMovement, int wings) {
		 super(modeOfMovement);
		 this.wings = wings;
	 }
	//you need to use setter and getter methods
	    /**
	     * 
	     */
	 public void setWings(int wings) {
		 this.wings = wings;
	 }
	 public int getWings() {
		 return wings;
	 }
	 @Override
	  public void move() {
		  System.out.print("with " + wings + " wings.");
	}
}
