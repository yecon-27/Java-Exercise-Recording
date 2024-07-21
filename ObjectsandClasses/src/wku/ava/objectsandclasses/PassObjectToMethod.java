package wku.ava.objectsandclasses;

public class PassObjectToMethod {

	public static void main(String[] args) {
		Circle myCircle = new Circle();
		myCircle.setRadius(7.5);
		myCircle.getRadius();
		printObject(myCircle);

	}
	public static void printObject(Circle cir) {
		//printformat: calculate
		System.out.printf("Radius of " + cir.getRadius() + " gives and area of %.2f", cir.getArea());
	}
}
