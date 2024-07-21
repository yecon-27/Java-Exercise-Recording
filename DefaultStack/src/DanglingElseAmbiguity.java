
public class DanglingElseAmbiguity {

	public static void main(String[] args) {
		int i = 4, j = 2, k = 5;

		if (i > j) 
		 if (i > k)
		 System.out.println("A");

		else 
		 System.out.println("B");

	}

}
