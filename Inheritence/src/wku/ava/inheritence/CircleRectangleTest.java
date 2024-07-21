package wku.ava.inheritence;
//Ye Cong 1306248
public class CircleRectangleTest {
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("A circle " + circle.toString());
		circle.setColor("Green");
		System.out.println("My color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		
		Rectangle rectangle = new Rectangle();
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
		
		Circle cir = new Circle();
		System.out.println("\nCir radius: " + cir.getRadius());
		System.out.println("Cir Area: " + cir.getArea());
		cir.setColor("Red");
		System.out.println(cir.getColor());
		System.out.println(cir.isFilled());
	}
}
