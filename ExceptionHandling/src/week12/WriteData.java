package week12;
import java.io.IOException;
public class WriteData {

	public static void main(String[] args)throws java.io.IOException {
		java.io.File file = new java.io.File("score2.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		try{
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		output.close();
			}catch (IOException e) {
        // Handle the exception if the PrintWriter could not be created or written to
        e.printStackTrace();
}
			
}
	}
	