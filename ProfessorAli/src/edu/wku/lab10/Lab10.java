package edu.wku.lab10;

public class Lab10 {
/*Lab1*/
	public static int digitSum(int num){
		int sum = 0;
		int temp = 0;
		while (num != 0) {
			temp = num % 10;
			num = num / 10;
			sum += temp;
		}
		return sum;
	}
/*Lab2*/
	public static boolean isPalindrome(int num) {
		String numIntoString = num + "";
		int length = numIntoString.length();
		int low = 0;
		int high = length - 1;
		while(low < high) {
			if(numIntoString.charAt(low) != numIntoString.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
/*Lab3*/
	public static void computeSeries(int num) {
			double sum = 0.0;
			System.out.print("Series: " );
			for (int i = 1; i <= num ; i++) {
				double term = (double) i / (i + 2);
				sum += term;
				System.out.print(i + "/" + (i + 2));
				if(i < num)
					System.out.print(" + ");
			}
			System.out.println();//
			System.out.print("Sum of the series " + sum);
		}
/*Lab4*/
	public static boolean isValidPassword (String password) {
		int length = password.length();
		int digitCount = 0;
		if (length < 16) 
			return false;
		else {
		for (int i = 1; i <= length ; i++) {
			char ch = password.charAt(i);
			if (!Character.isLetterOrDigit(ch) && ch != '+') {
	                return false;
	            }
	        if (Character.isDigit(ch)) {
	                digitCount++;
	            }
	        if (digitCount >= 3) {
                break;
            }
	        }

	        return digitCount >= 3; 
	    }
		
	}
/*Lab5*/
	public static int Calculate(int value) {
		value = value + value;
		return value;
	}
		
	public static int Calculate (int value1, int value2) {
		int difference = value1 - value2;
		return difference;
	}
		
	public static double Calculate (double value1, double value2) {
		double product = value1 * value2;
		return product;
	}
		
	public static String Calculate (String String1, String String2) {
		String finalString = String1.concat(String2);
		return finalString;
	}
}
