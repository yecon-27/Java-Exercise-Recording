package wku.ava.multidimensionalarrays;

public class FindMinInOneDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] num = {2, 8 ,0 ,6, 4};
			findTheMinimum(num);
		}
		public static void findTheMinimum(int[] arr) {
			int min = arr[0];
			int indexMax = 0;
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
					indexMax = i + 1;
				}
			}
			
			System.out.println("The max is " + min + " in index " + indexMax);
			
	}
// Ye Cong 1306248
}
