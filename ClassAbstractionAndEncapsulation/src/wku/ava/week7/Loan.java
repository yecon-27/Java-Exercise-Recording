package wku.ava.week7;
//Ye Cong 1306248
public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	//No argument constructor--default constructor!!
	public Loan() {
		this(2.5, 1, 1000);//AIR NOY LA
	}//alliers name for the object/constructor
	//Construct a loan with specified annual interest rate, number of years, and loan amount
	
	public Loan (double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;//this: class variable 
		// annualInterestRate: the valuable inside the constructor
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
		
	}
	public double getAnuualInterestRate() {
		return annualInterestRate;
	}
	public void setAnuualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 
				(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	public java.util.Date getLoanDate(){
		return loanDate;
	}
		//Ye Cong 1306248
}

