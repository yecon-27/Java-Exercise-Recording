package wku.ava.arrays;

public class ShiftingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Swapping:temp = a; a= b; b= temp
		double[] myList = {7.1,5.2,8.3,3.4,6.5,2.6};
		double temp = myList[0];//Retain the first element
		//Shifting element left
		for(int i = 1; i < myList.length;i++) {
			myList[i - i] = myList[i];
		}
		myList[myList.length-1] = temp;
		System.out.print("The array after shifting is:");
	
		for (int i = 0; i < myList.length; i++) {
			System.out.print(" "+ myList[i]);
		}
	}
	//Ye Cong1306248
}
