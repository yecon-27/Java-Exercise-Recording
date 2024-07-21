package wku.ava.week7;
//Ye Cong 1306248
public class Course {
	private String courseName;
	private String[] students = new String[4];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStudents(){
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudents(String student) {
		//Left as an exercise in Exercise 10.9
		int i;
		for(i = 0; i < students.length; i++)
			if (students[i] == student)
				students[i] = null;
				numberOfStudents--;
				System.out.println("The student who is removed is: "+ students[i]);
				System.out.println("The correspoding index is: "+ i);
				
				
	}
}//end class Course
