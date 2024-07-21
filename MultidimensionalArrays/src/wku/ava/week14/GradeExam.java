package wku.ava.week14;
import java.util.Scanner;
public class GradeExam {

	
	public static void main(String[] args) {
		char[][] grade = new char[5][10];
		System.out.println("Enter each student's grade");
		
		Scanner input = new Scanner(System.in);
		char[] charArray = new char[50]; // Assuming you won't enter more than 100 characters
	    int index = 0;

	    while (input.hasNext()) {
	        String inputLine = input.next();
	        if ("end".equals(inputLine)) {
	            break; // End the input loop when the user types 'end'
	        }
	        for (int i = 0; i < inputLine.length() && index < charArray.length; i++) 
                charArray[index++] = inputLine.charAt(i); // 将字符存储到数组中
            }
	    
	    input.close();
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[0].length; j++) {
				grade[i][j] = charArray[i*j + j];
 			}
		}
	}

}
