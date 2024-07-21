package wku.ava.objectsandclasses;
//Ye Cong 1306248
public class CircleWithStaticDataFieldApp {

	public static void main(String[] args) {
		//The constructor is used to set the radius
		//you dont need to call the setter method just initiatliaze
		//only the setter and getter method to protect the data
		//not information/data hiding: no need(also means encapsulation)
		CircleWithStaticDataField myCircle = new CircleWithStaticDataField(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		//This is a method
		System.out.println("The number of objects created is " + CircleWithStaticDataField.getNumberOfObjects());
		
		
		CircleWithStaticDataField myCircle2 = new CircleWithStaticDataField();
		myCircle2.setRadius(7.5);
		myCircle2.getRadius();
		System.out.println("Area of 2nd object is: " + myCircle2.getArea());
		
		System.out.println("The number of objects created is now " + CircleWithStaticDataField.getNumberOfObjects() );
	}

}
