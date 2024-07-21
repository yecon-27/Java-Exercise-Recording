package week12;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("score2.txt");
		Scanner input = new Scanner(file);
		input.useDelimiter(",|\n");

		while (input.hasNextLine()) {
		    String line = input.nextLine();
		    String[] parts = line.split(" ");
		    String firstName = parts[0];
		    String middle = parts[1];
		    String lastName = parts[2];
		    int score = Integer.parseInt(parts[3]); // 使用 parseInt 而不是 nextInt
		    System.out.println(firstName + " " + middle + " " + lastName + " " + score);
		}
		input.close();
		
	}
}
