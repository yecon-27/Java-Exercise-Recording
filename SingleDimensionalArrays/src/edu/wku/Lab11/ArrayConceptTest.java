package edu.wku.Lab11;

public class ArrayConceptTest {

	public static void main(String[] args) {
		
		/*(a) Display the 9 element of an array“fun” contains 30 integers.*/
		int[] fun = new int[30];
		for(int i = 0; i < fun.length; i++) {
			fun[i] = (int)(Math.random()* 10);
		}
		System.out.println("The 9 element of array fun is: " + fun[8]);
		
		/*(b) Initialize each of the five elements of an integer array“fun2” with 8.*/
		int[] fun2 = new int[5];
		for(int i = 0; i < fun2.length; i++) {
			fun2[i] = 8;
		}
		
		/*(c) Total the 100 elements of floating-point array“fun3”.*/
		double[] fun3 = new double[100];
		double sum = 0;
		for(int i = 0; i < fun3.length; i++) {
			fun3[i] = Math.random() * 3.0;
			sum += fun3[i];
		}
		System.out.println("The total of fun3 array is " + sum);
		
		/*(d) Copy first 11-element of array of “fun” into the last 11 positions of array“fun3” and show that they are copied successfully along with their indexes.*/
		//make the last 11 positions of elements be compatible with fun3 array
		double[] fun4 = new double[30];
		for(int i = 0; i < fun4.length; i++) {
			fun4[i] = fun[i];
		}
		//the last variable should not be fun4.length, but to be 11 instead 
		//the starting position of target array is 89 = 100 - 11;
		System.arraycopy(fun4, 0, fun3, fun3.length -11 , 11);//Index Calculation: If fun3 has a total of 100 elements, then fun3.length would be 100.
//To copy into the last 11 positions, you would calculate the starting index as 100 - 11, which equals 89. 
//So, 89 is the correct index to start copying to the last 11 elements of fun3.
//Starting Position: The choice between 89 and 88 depends on where you want the copied elements to begin within fun3. If you want them to start at the 90th index (counting from 0), then 89 is the correct starting position.
		System.out.println("After changing the last 11 elements of fun3, now the last 11 positions of fun3 array become: " );
		for(int i = 89; i < 100; i++) {
		//i refers to index
			System.out.println("fun3[" + i +"] = " + fun3[i]);
		}
		
		/*(e) Determine and display the smallest and largest values contained in array “fun” along with their indexes.*/
		/*the very prestep: show array fun*/
		System.out.print("The array fun = {");
		for (int e : fun) {
			System.out.print(e + " ");
		}
		System.out.println("}");
		/*the smallest value*/
		int min = fun[0];
		int indexOfMin = 0;
		for(int i = 1; i < fun.length; i++) {
			if (fun[i] < min) {
				min = fun[i];
				indexOfMin = i;
			}
		}
		System.out.println("The smallest value in array fun is: fun[" + indexOfMin + "] = " + min + " (Default Sets: only show the first occurrence)");
		/*the biggest value*/
		int max = fun[0];
		int indexOfMax = 0;
		for(int i = 1; i < fun.length; i++) {
			if (fun[i] > max) {
				max = fun[i];
				indexOfMax = i;
			}
		}
		System.out.println("The biggest value in array fun is: fun[" + indexOfMax + "] = " + max + " (Default Sets: only show the first occurrence)");
		
	}
}
