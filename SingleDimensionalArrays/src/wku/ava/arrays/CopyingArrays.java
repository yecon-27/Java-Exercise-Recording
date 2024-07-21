package wku.ava.arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using a for loop
		int[] source = {2 ,3 ,1 ,5 ,10};
		int[] target = new int[source.length];
		
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}		
		//Print first array
		//for s of type int in source
		for(int s: source)
			System.out.print(s+" ");
		System.out.println();
		//Print second array
		for(int t : target)
			System.out.print(t+" ");
		}
		//end method main
	}
	//end class
//Ye Cong 1306248
