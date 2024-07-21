package wku.ava.week7;
import java.util.Scanner;
public class LoanTest {
//always look for the main method
	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		//enter yearly interest rate
		System.out.print(
				"Enter annual interest rate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();
		//enter number of years
		System.out.print("Enter number of years as an integers: ");
		int numberOfYears = input.nextInt();
		//Enter loan amount
		System.out.print("Enter loan amount, for example,120000,95: ");
		double loanAmount = input.nextDouble();
		//create loan object
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		//display loan date, monthly payment, and total payment
		System.out.printf("The loan was created on %s\n" + 
		"The monthly payment is %.2f\nThe total payment is %.2f\n", 
		loan.getLoanDate().toString(), loan.getMonthlyPayment(),
		loan.getTotalPayment());
		input.close();
		}
// Ye Cong 1306248
}
