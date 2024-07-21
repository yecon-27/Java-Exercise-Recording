package wku.ava.inheritence;
//Ye Cong 1306248
public class Circle extends GeometricObject{
	private double radius;//declared property
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {//declared + inherited properties(do not need to redefine)
		super(color,filled);
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public double getDiameter() {
		return 2 * radius;
	}
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	public void printCircle() {
		System.out.println("The circle is created "+ getDateCreated() +
				" and the radius is " + radius);
	}
}
