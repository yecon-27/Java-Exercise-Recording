package wku.ava.week13;

import wku.ava.inheritence.Circle;
import wku.ava.inheritence.GeometricObject;
import wku.ava.inheritence.Rectangle;

public class GeometricObjectEqualTest {

	public static void main(String[] args) {
		GeometricObject geoObject1 =new Circle(5);
		GeometricObject geoObject2 =new Rectangle(5, 3);
		
		System.out.println("The two objectsh have the same area? " + 
		equalArea(geoObject1, geoObject2));
		
		displayGeometricObject(geoObject1);
		displayGeometricObject(geoObject1);

	}
	public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}
	
	public static boolean displayGeometricObject(GeometricObject object1) {
		System.out.println();
		System.out.println("The area is " + object1.getArea());
		System.out.println("The perimeter is " + object1.getPerimeter());
		return true;
	}

}
