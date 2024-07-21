package wku.ava.arrays;

public class RandomValues {
	public static void main(String[] args){
		double[] myList = new double [5];
		for (int i = 0 ; i < myList.length ; i++) {
			myList[i] = (Math.random()*100);
			System.out.println(myList[i]);
		}
		
		//Cong Ye 1306248
	}

}
