package wku.ava.arrays;

public class C_L_I_input {
	public static void main(String[] args) {
	
	java.util.Scanner input = new java.util.Scanner(System.in);
	double[] myList = new double[5];
	System.out.println("Enter "+myList.length+" values: ");
	for(int i = 0; i < myList.length;i++){
		myList[i] = input.nextDouble();
		System.out.println("index[" + i + "]:" + myList[i]) ;
		}
	//Cong Ye 1306248
	input.close();//to avoid memory leak
	}
}
