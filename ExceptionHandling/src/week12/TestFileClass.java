package week12;
//Ye Cong 1306248
//import java.io.File;
public class TestFileClass {

	public static void main(String[] args) {
		//How to create a file
		java.io.File file = new java.io.File("image /ava.gif");
		
		System.out.println("Does it exist? " + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Is it absoulte? " + file.isFile());
		System.out.println("Is it hidden?" + file.isHidden());
		System.out.println("Absoulute path is " + file.getAbsolutePath());
		System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
	}

}
