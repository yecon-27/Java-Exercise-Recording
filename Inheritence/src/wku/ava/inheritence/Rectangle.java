package wku.ava.inheritence;
//Ye cong 1306248
public class Rectangle extends GeometricObject{
	private double width;
	private double height;
	
	public Rectangle() {
	}
	public Rectangle(double width, double height) {
		
	}
	public Rectangle(String color, boolean filled, double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color,filled);
		this.width = width;
		this.height = height;
	}
	public void setWideth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	@Override
	public double getArea() {
		return width * height;
	}
	@Override
	//invoke the superclass method and modify the method in this case
	public double getPerimeter() {
		return 2 * (width + height);
	}
	public String printRectangleDate() {
		return ("The rectangle is created " + super.getDateCreated() + " and the height is "+ height);
	}
}
