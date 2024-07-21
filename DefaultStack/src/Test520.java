
public class Test520 {

	public static void main(String[] args) {
		int[] myList;
		myList = new int[10];
		System.out.print("The array is: {");
		for(int e : myList) {
			System.out.print(e + " ");
		}
		System.out.println(")");
		
		myList = new int[20];
		System.out.print("The array now becomes: {");
		for(int e : myList) {
			System.out.print(e + " ");
		}
		System.out.println(")");
	}

}
