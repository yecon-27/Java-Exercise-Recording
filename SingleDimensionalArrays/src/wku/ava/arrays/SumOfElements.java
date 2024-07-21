package wku.ava.arrays;

public class SumOfElements {
	public static void main(String[]args) {
		int[] myList = {7,5,8,3,6,2};
		int total = 0;
		for(int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println(total);
	}
//Ye Cong 1306248
}
