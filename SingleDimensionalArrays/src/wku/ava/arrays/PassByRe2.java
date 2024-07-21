package wku.ava.arrays;

public class PassByRe2 {
	public static void main(String[] args) {
		int[] myList = {7, 9, 3, 4, 1, 5};
			System.out.print(myList[2]+" ");
		System.out.println();
		PassbyRe2(myList);
		System.out.print(myList[2]+" ");
	}	
		public static void PassbyRe2(int[] myList) {
				myList[2] = myList[2]*2;
			System.out.print(myList[2]+" ");
			System.out.println();
			
			
	}
	//Ye Cong 1306248
}
