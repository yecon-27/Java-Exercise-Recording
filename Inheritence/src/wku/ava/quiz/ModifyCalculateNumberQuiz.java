package wku.ava.quiz;
//Ye Cong 1306248
//Concrete subclass
public class ModifyCalculateNumberQuiz extends MyCalculateNumberQuiz{
	
	public ModifyCalculateNumberQuiz() {}
	@Override
	public double modulo(double x, double y) {
		return x % y;
	}

	public static void main(String[] args) {
		//An abstract class can be used as a data type for a reference variable
		//MyCalculateNumberQuiz num;
		// 使用具体类 ModifyCalculateNumberQuiz 来实例化，因为 MyCalculateNumberQuiz 是抽象类
        MyCalculateNumberQuiz num = new ModifyCalculateNumberQuiz();
		System.out.println("Addition of 1 and 2 is: " + num.add(1, 2));
		System.out.println("Subtraction of 1 and 2 is: " + num.subtract(1, 2));
		System.out.println("Multiplication of 1.0 and 2.0 is: " + num.multiply(1.0, 2.0));
		System.out.println("Division of 1.0 and 2.0 is: " + num.divide(1.0, 2.0));
		System.out.println("Square of 1 is: " + num.square(1));
		System.out.println("Modulo of 1.0 and 2.0 is: " + num.modulo(1.0, 2.0));
	
	}

}
