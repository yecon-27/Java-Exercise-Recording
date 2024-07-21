package wku.ava.week13;
import java.util.Scanner;
public class FindMaxAndPrintAccordingIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 values in an array: ");
		int[] array = new int[10];
		int i = 0;
		while(i < 10) {
			array[i] = input.nextInt();
			i++;
		}
		input.close();
		int max = array[0];
		int j = 1;
		while(j < 10) {
			if (array[j] > max)
				max = array[j];
			j++;
		}
		int z = 0;
		while(z < 10) {
			System.out.println("The value of index " + z + "is " + array[z]);
			z++;}
		System.out.println("The largest element of array is " + max);
	}

}
