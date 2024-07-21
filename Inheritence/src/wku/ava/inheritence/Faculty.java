package wku.ava.inheritence;
//Ye Cong 1306248
public class Faculty extends Employees{

	public static void main(String[] args) {
		new Faculty();
	}
	public Faculty() {
		System.out.println("(4) Performs Faculty's tasks");
	}
}//Different from procedural programming
//OOP is going to fetch the method you invoke
		 
	class Employees extends People{
		public Employees() {
			this("(2) Invoke Employee's overloaded constructor");//this refers to the constructor
			System.out.println("(2) Peroforms Employee's tasks");
		}
	
		public Employees(String s) {
			System.out.println(s);
		}
	}
	class People{
		public People() {
			System.out.println("(1) Performs Person's tasks");
		}
	}
	