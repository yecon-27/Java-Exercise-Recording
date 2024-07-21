package wku.ava.arrays;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {7.1,5.2,8.3,3.4,6.5,2.6};
		double max = myList[0];
		for(int i = 1; i <myList.length; i++) {
			if(myList[i] > max) max = myList[i];
		}
		System.out.println(max);
	}
//Ye Cong 1306248
}
