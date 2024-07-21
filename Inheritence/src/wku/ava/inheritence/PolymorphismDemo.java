package wku.ava.inheritence;
//when the superclass? is in different class
/*import wku.ava.inheritence.Circle;
import wku.ava.inheritence.GeometricObject;
import wku.ava.inheritence.Rectangle;
*/
//Ye Cong 1306248
public class PolymorphismDemo {

	public static void main(String[] args) {
		//passing objects to method = passing reference to method
		displayObject(new Circle(1, "red", false));
		displayObject(new Rectangle(1, 1, "black", true));

	}
	//GeometricObject variable is used to reference the Circle and Rectangle objects
	//GeometricObject object = new Circle(1, "Red", false);
public static void displayObject(GeometricObject object) {
	System.out.println("Created on" + object.getDateCreated()+
			". Color is" + object.getColor());
}
}
