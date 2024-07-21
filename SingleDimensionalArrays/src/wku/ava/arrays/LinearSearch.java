package wku.ava.arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 3, 1, 5, 10, 4};
		int key = 5;
		linearSearch(array, key);
	}
	public static void linearSearch(int[]array , int key) {
		for (int i = 0; i < array.length; i++) {
			if(key == array[i])
				System.out.println("Element is in index: " + i);
			else
				System.out.println("Not found");
		}
	}//Ye Cong 1306248
}
