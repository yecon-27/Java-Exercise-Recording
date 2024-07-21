package wku.ava.objectsandclasses;
//Ye Cong 1306248
public class Circle {
	private double radius;
	private double area;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		area = Math.PI * radius * radius;
		return area;
	}
	public void area() {
		System.out.println("The area of the circle is: " + Math.PI * radius * radius);
	}
	public void perimeter() {
		System.out.println("The perimeter of the circle is: " + 2 * Math.PI * radius);
	}
}
