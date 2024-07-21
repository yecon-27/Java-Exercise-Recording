package wku.ava.arrays;

public class NumbersAboveAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = new int[100];
		int sum = 0;
		int count = 0;
		for(int i = 0; i <100 ; i++) {
			myList[i] = i + 1;
			sum += myList[i];	
		}
		int average = sum /100;
		System.out.println(average);
		for(int i = 0; i < myList.length; i++) {
			if(myList[i] > average) {
				count++;
			}
		}
	
	System.out.println(count);
	//Ye Cong 1306248
	}
}