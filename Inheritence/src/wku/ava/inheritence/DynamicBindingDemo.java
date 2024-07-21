package wku.ava.inheritence;

public class DynamicBindingDemo {

	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Persons());
		m(new Object());
	}
	//Method m() takes a parameter of the Object type
	//You can, then, invoke method m() with any object
public static void m(Object x) {
	System.out.println(x.toString());
}
}
class GraduateStudent extends Student{
	@Override
	public String toString() {
		return "Student 1";
	}
}
class Student extends Persons{
	@Override
	public String toString() {
		return "Student";
	}
}
class Persons extends Object{
		@Override
		public String toString() {
			return "Person";
		}
	}//end class Person

