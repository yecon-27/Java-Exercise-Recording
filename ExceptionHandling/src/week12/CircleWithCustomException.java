package week12;

public class CircleWithCustomException {
	private double radius;
	private static int numberOfObjects = 0;
	
	public CircleWithCustomException() throws InvalidRadiusException{
		this(1.0);
	}
	public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
		setRadius(newRadius);
		numberOfObjects++;
	}
	public void setRadius (double newRadius) throws InvalidRadiusException {
		if (newRadius < 0) 
			throw new InvalidRadiusException(newRadius);
		else
			radius = newRadius;
	}
	public double getRadius() {
		return radius;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double findArea() {
		return radius * radius * 3.14159;
	}
	
}
