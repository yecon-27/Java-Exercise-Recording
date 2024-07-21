package wku.ava.objectsandclasses;
// Ye Cong 1306248
public class CircleWithStaticMemeberApp2 {

	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is" + CircleWithStaticMembers.numberOfObjects);
		
		//create c1
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		
		//Display c1 before c2 is created 
		System.out.println("\nAfeter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
		
		//Create c3
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		//Modify c1
		c1.radius = 9;
		
		//Display c1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle Objects (" + c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle Objects (" + c2.numberOfObjects + ")");
		CircleWithStaticMembers c3 = new CircleWithStaticMembers(5);
		//Modify c3
		c3.radius = 14.7;
		System.out.println("\nAfter creating c3 and modifying c1 and c2");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle Objects (" + c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle Objects (" + c2.numberOfObjects + ")");
		System.out.println("c3: radius (" + c3.radius + ") and number of Circle Objects (" + c3.numberOfObjects + ")");
	}

}