package wku.ava.objectsandclasses;
//Ye Cong 1306248
public class CircleWithStaticDataField {
	private double radius = 1;

	private static int numberOfObjects = 0;//Count number of objects created
	
	//construct a circle with radius1
	public CircleWithStaticDataField() {
		numberOfObjects++;
	}
	public CircleWithStaticDataField(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	//set a new radius
	public void setRadius(double newRadius) {
	//tenary operator
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	public double getRadius() {
		return radius;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
