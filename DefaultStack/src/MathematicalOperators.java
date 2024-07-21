
public class MathematicalOperators {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(4));//2.0

		System.out.println(Math.sin(2 * Math.PI));//-2.xxxE-16

		System.out.println(Math.cos(2 * Math.PI));//1.0

		System.out.println(Math.pow(2, 2));//4.0

		System.out.println(Math.log(Math.E));//1.0

		System.out.println(Math.exp(1));//2.718281828459045

		System.out.println(Math.max(2, Math.min(3, 4)));//3

		System.out.println(Math.rint(-2.5));//-2.0

		System.out.println(Math.ceil(-2.5));//-2.0
		
		System.out.println("\n");
		
		System.out.println(Math.floor(-2.5));//-3.0

		System.out.println(Math.round(-2.5f));//-2

		System.out.println(Math.round(-2.5));//-2

		System.out.println(Math.rint(2.5));//2.0

		System.out.println(Math.ceil(2.5));//3.0

		System.out.println(Math.floor(2.5));//2.0

		System.out.println(Math.round(2.5f));//3

		System.out.println(Math.round(2.5));//3

		System.out.println(Math.round(Math.abs(-2.5)));//3

	}

}
