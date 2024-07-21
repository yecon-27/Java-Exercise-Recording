package wku.ava.arrays;

public class LinearSeach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 3, 1, 5, 10, 4};
		int key = 5;
		System.out.println(linearSearch(array,key));
		}
	public static int linearSearch(int[] array, int key) {
		for(int i = 0; i < array.length; i++) {
			if (key == array[i])//IF (key == array[i])Then return i ;//bracket use is for one more instructions
				return i;
		}
		return -1;
	}
//Ye Cong 1306248
}
