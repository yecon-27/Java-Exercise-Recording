package wku.ava.objectsandclasses;

public class CircleWithStaticMembers {
	double radius;
//The number of objects created
	static int numberOfObjects = 0;
//construct a circle with radius1
	CircleWithStaticMembers(){
		radius = 1.0;
		numberOfObjects++;
	}
	
	CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	//default modifier
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	//default modifier
	double getArea() {
		return radius * radius * Math.PI;
	}
}
