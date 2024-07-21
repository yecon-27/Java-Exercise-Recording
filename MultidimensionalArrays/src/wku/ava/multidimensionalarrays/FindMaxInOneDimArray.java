package wku.ava.multidimensionalarrays;

public class FindMaxInOneDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2, 8 ,0 ,6, 4};
		findTheMaximum(num);
	}
	public static void findTheMaximum(int[] arr) {
		int max = arr[0];
		int indexMax = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				indexMax = i + 1;
			}
		}
		
		System.out.println("The max is " + max + " in index " + indexMax);
		
	}
		// Ye Cong 1306248
}
