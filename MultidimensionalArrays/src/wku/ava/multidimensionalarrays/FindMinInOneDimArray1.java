package wku.ava.multidimensionalarrays;

public class FindMinInOneDimArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logic: calculation, 
		int[] num = {2, 8 ,0 ,6, 4};
		int min = num[0];
		int indexMin = 0;
		
		for(int i = 1; i < num.length ; i++) {
			if(num[i] < min) {
				min = num[i];
				indexMin = i;
			}
		}
		System.out.println("Min is " + min + " in index " + indexMin);
	}
// Ye Cong 1306248
}
