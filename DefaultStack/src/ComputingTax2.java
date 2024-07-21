import java.util.Scanner;
public class ComputingTax2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int income = sc.nextInt();
		double tax = 0;
		if (income <= 10000)
			 tax = income * 0.1;

		else if (income > 10000 &&
			 income <= 20000)
			 tax = 1000 +
			 (income - 10000) * 0.15;
		System.out.println(tax);
		sc.close();
	}

}
