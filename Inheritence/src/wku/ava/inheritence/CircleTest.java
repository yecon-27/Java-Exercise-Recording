package wku.ava.inheritence;

public class CircleTest {

	public static void main(String[] args) {
		Circle cir = new Circle("Red", false, 2);
		System.out.println("\nA rectangle " + cir.toString());
		System.out.println("The Area is " + cir.getArea());
		System.out.println("The perimeter is "+ cir.getPerimeter());

	}

}
