
public class ArrayLength {

	public static void main(String[] args) {
		int[] array = new int[10];
		System.out.print("The value of array before recreating: " );
		for(int e:array) {
			System.out.print(e + " ");
		}
		System.out.print("\nThe length of array before recreating: " + array.length);
		
		
		array = new int[3];
		System.out.print("\nThe value of array after recreating: " );
		for(int e:array) {
			System.out.print(e + " ");
		}
		System.out.print("\nThe length of array after recreating: " + array.length);
	}

}
