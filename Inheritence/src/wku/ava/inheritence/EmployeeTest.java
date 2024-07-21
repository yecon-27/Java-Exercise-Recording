package wku.ava.inheritence;
//Ye Cong 1306248
public class EmployeeTest {

	public static void main(String[] args) {
		//If you don't initialize the value in the parameter, you need use set method
		Employee emp1 = new Employee("Ken", "Ehi", 60, 42.50);
		emp1.getFirstName();
		emp1.getLastName();
		emp1.getHours();
		emp1.getMyRate();
		System.out.println(emp1.toString());
		
		Employee emp2 = new Employee("Ava", "Perry", 40, 40.50);
		emp2.getFirstName();
		emp2.getLastName();
		emp2.getHours();
		emp2.getMyRate();
		System.out.println(emp2.toString());
	}

}
