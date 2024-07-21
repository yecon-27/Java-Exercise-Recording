package week12;
import java.util.Scanner;

public class ReadFileFromURL {
  public static void main(String[] args) {
    System.out.print("Enter a URL: ");   
    Scanner scanner = new Scanner(System.in);
	String URLString = scanner.next();
	
    try {
      java.net.URL url = new java.net.URL(URLString); 
      int count = 0;
      //Different control current: System.in / url.openStream()
      Scanner input = new Scanner(url.openStream());
      //Does input has any data to read?
      while (input.hasNext()) {
        String line = input.nextLine();
        count += line.length();
      } 
      
      System.out.println("The file size is " + count + " characters");
    }
    catch (java.net.MalformedURLException ex) {
      System.out.println("Invalid URL");
    }
    catch (java.io.IOException ex) {
      System.out.println("IO Errors");
    }
    
  }
}   