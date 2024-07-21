package wku.ava.objectsandclasses;
//Ye Cong 1306248
public class CircleWithMain {
	private double radius; // only available to the objects and methods of this class
	
	//construct a circle with radius 1
	CircleWithMain(){//parameter constructor
		radius = 1;//body of the constructor
	}
	//construct a circle with a specified radius
	CircleWithMain(double newRadius){
		radius = newRadius;
	}
	//use method
	double getArea() {
	return radius * radius * Math.PI;}
	
	double getPerimeter() {
		return 2 * radius * Math.PI;}
	void setRadiuss(double newRadius) {
		radius = newRadius;
	}

//Main method
public static void main(String[] args) {
	//create a circle with radius
	CircleWithMain cir1 = new CircleWithMain();
	System.out.println("Radius " + cir1.radius + " Area is " + cir1.getArea());
	CircleWithMain cir2 = new CircleWithMain(25);
	System.out.println("Radius " + cir2.radius + " Area is " + cir2.getArea());
	CircleWithMain cir3 = new CircleWithMain(125);
	System.out.println("Radius " + cir3.radius + " Area is " + cir3.getArea());
	//modify circle radius
	cir2.radius = 100;
	System.out.println("Radius " + cir2.radius + " Area is " + cir2.getArea());
}
}