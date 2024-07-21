
public class TimeOfIteration {

	public static void main(String[] args) {
		//make the variable increment inside the condition of if statement
		//you can leave the increment i inside the if parentheses 
		//you can also put it after the print statement, but remember to add bracket to it
		int i = 1;
		while (i < 10) 
			if ((i++) % 2 == 0)
				System.out.println(i);
		//make the variable increment inside the parentheses of print statement
		//the execution didn't run since the j is a constant 1, that will not enter the if statement
		int j = 1;
		while (j < 10) 
			if (j % 2 == 0) 
				System.out.println(j++);
	}

}
