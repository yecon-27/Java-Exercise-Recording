import java.util.Scanner;
public class QuadraticFormula {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // 获取用户输入的系数
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        // 计算判别式
        double discriminant = b * b - 4 * a * c;

        // 检查判别式的值
        if (discriminant > 0) {
            // 两个不同的实数解
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // 一个实数解
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            // 两个复数解
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }

        input.close();


	}

}
