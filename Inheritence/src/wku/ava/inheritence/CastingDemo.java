package wku.ava.inheritence;
//Ye Cong 1306248
public class CastingDemo {

	public static void main(String[] args) {
		Circle object1 = new Circle(7.5);
		displayObject(object1);

	}
public static void displayObject(Object object) {
	if (object instanceof Circle) {
		System.out.println("Circle is: " + (object instanceof Circle));
		System.out.println("The circle area is: " + ((Circle) object).getArea());
	}
	//The return type of instanceof is boolean value
	System.out.println("GeometricObject: " + (object instanceof GeometricObject));
	System.out.println("Rectangele is: " + (object instanceof Rectangle));
	System.out.println("Java Object is: " + (object instanceof Circle));
}
}
