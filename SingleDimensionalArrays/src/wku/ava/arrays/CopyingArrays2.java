package wku.ava.arrays;

public class CopyingArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First array is:");
		int[] source = {20, 50, 10, 50, 20};
		for(int i : source ) {
			System.out.print(i+ " ");
		}
		int[] target = new int[source.length];
		System.out.println();
		System.arraycopy(source, 0, target, 0, source.length);
		
		System.out.println("Second array is:");
		for(int t : target ) {
			System.out.print(t+ " ");
		}
	}
//Ye Cong 1306248
	}
