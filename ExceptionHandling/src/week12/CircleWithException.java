package week12;

public class CircleWithException {
	private double radius;
	private static int numberOfObjects = 0;
	
	public CircleWithException() {
		this(1.0);
	}
	
	public CircleWithException(double newRadius) {
		setRadius(newRadius);
		numberOfObjects++;
	}
	public double getRadius() {
		 return radius;
	 }
	 
	public void setRadius(double newRadius)throws IllegalArgumentException {//declare exception
		if (newRadius >= 0)
			radius = newRadius;
		else
			//println will make the program terminate
			//the advantage of using try-catch is make it continue
			throw new IllegalArgumentException("Radius cannot be negative");//throw exception
	}
	public static int getNumberOfObject() {
		return numberOfObjects;
	}
	
	public double findArea() {
		return radius * radius * 3.14159;
	}
	
	
}
