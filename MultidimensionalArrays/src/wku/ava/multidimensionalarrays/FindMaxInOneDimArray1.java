package wku.ava.multidimensionalarrays;

public class FindMaxInOneDimArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2, 8 ,0 ,6, 4};
		int max = num[0];
		int indexMax = 0;
		
		for(int i = 1; i < num.length ; i++) {
			if(num[i]>max) {
				max = num[i];
				indexMax = i;
			}
		}
		System.out.println("Max is " + max + " in index " + indexMax);
	}
		// Ye Cong 1306248
}
