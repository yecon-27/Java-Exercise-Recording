package wku.ava.objectsandclasses;
// Ye Cong 1306248
public class Rectangle {
	//the date of every type can be secured
	private double length;
	private double width;
	//same as the following code
	//void setLength(double len){
	//	length = len;
	//}
	//take the length as parameter, assign it to the object
	public void setLength(double length) {
		//"this" is a class variable
		this.length = length;
	}
	//double getLength(){
	//return length;
	//}
	public double getLength() {
		return length;
	}
	public void setWidth(double width) {
		//"this" is a class variable
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	
	public double area() {
		System.out.print("Area of a rectangle is: ");
		return length * width;
	}
	public double perimeter() {
		return 2*(length + width);
	}
}