package edu.wku.lab10;
import java.util.Scanner;
public class PasswordValidator {

	public static void main(String[] args) {
		//1.Read Input
		System.out.print("Enter your password: ");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		
		
		input.close();
		//3.Initialize the Identity value
		//Don't use following kind, you did'nt change the isValid
		/*boolean isValid = true;
		/*if (passwordValidity(length,password,isValid))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");*/
		boolean isValid = isValidPassword(password);
		 if (isValid) {
	            System.out.println("Valid Password");
	     } else {
	            System.out.println("Invalid Password");
	     }
	}//end main method
	
	//4.PasswordValidity Method
	//4.1. at least 16 characters: length < 16 
	//4.2. comparing and testing characters methods: isLetterOrDigit(ch),isDigit(ch); relational operators(comparing operators)—whether is true; logical operators (Boolean operators)—condition: &&
	//4.3 at least 3 digits
	public static boolean isValidPassword(String password) {
		//2.Gain the length of password
		int length = password.length();
		int digitCount = 0;
		if (length < 16) 
			return false;
		else {
		for (int i = 1; i <= length ; i++) {
			char ch = password.charAt(i);//Make it much readable
			if (!Character.isLetterOrDigit(ch) && ch != '+') {
	                return false;
	            }
	        if (Character.isDigit(ch)) {
	                digitCount++;
	            }
	        if (digitCount >= 3) {
                break; // exit the loop if we have found at least 3 digits
            }
	        }//end for loop

	        return digitCount >= 3; // Return true only if at least 3 digits are found
	    }//end else block
		
	}
	}

