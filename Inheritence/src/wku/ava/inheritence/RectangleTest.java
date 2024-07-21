package wku.ava.inheritence;
//Ye Cong 1306248
public class RectangleTest {

	public static void main(String[] args) {
	Rectangle rectangle = new Rectangle("Red", false, 2, 4);
	System.out.println("\nA rectangle " + rectangle.toString());
	System.out.println("The Area is " + rectangle.getArea());
	System.out.println("The perimeter is "+ rectangle.getPerimeter());
	System.out.println(rectangle.printRectangleDate());
	}

}
