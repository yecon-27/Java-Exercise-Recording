package wku.ava.objectsandclasses;
import java.io.IOException;
import java.io.PrintWriter;


public class OutputToFile {

		public static void main(String[] args) throws IOException{
			// TODO Auto-generated method stub
			PrintWriter outFile = new PrintWriter("C:/JavaPrograms/students.txt");
			
			outFile.println("Jet");
			outFile.println("Jenny");
			outFile.println("Zet");
			outFile.println("Sue");
			outFile.println("Roger");
			outFile.println("Brave");
			
			outFile.close();
		}

	}
// Ye Cong 1306248

