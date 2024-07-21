package wku.ava.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
		int searchKey = 8;
		System.out.println("Search key index is: " + binarySearch(arr, searchKey));
	}
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while(high >= low) {
			int mid = (low + high) / 2;
			if(key < list[mid])
				high = mid - 1;
			else if(key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return - 1 - low;
	}//Ye Cong 1306248
}
