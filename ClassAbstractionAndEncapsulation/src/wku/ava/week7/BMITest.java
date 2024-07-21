package wku.ava.week7;

public class BMITest {

	public static void main(String[] args) {
		BMI bmi1 = new BMI("John Doe", 18, 145, 72);
		System.out.println("The BMI for " + bmi1.getName() + " is " 
		+ bmi1.getBMI() + " " + bmi1.getStatus());
		
		BMI bmi2 = new BMI("Jackson", 18, 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is " 
				+ bmi2.getBMI() + " " + bmi2.getStatus());
	}

}
