package wku.ava.as1;
//Ye Cong 1306248
import java.util.Scanner;
public class TrigonometricFunction {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter an angle in degrees
		System.out.print("Enter an angle in degrees: ");
		double angleInDegrees = input.nextDouble();
		//Convert angle from degrees to Radians
		double angleInRadians = Math.toRadians(angleInDegrees);
		//Print the converted angle in Radians for debugging
		System.out.println("The angle in radians is: " + angleInRadians);
		
		//Execute 3 Trigonometric functions of the angle
		System.out.println("The sin value for the angle is: " + Math.sin(angleInRadians));
		System.out.println("The cos value for the angle is: " + Math.cos(angleInRadians));
		System.out.println("The tan value for the angle is: " + Math.tan(angleInRadians));
		//To avoid the source leaking
		input.close();
	}
}
