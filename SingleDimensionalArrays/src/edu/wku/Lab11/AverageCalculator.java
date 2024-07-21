package edu.wku.Lab11;
import java.util.Scanner;
public class AverageCalculator {

	public static void main(String[] args) {
		//1.Prompt the user to enter 10 double values in an array
		Scanner input = new Scanner(System.in);
		System.out.println("Pleae enter 10 deciamals to fill in the double-type array: ");
		double[] doubleArray = new double[10];
		int i = 0;
		while(i < 10) {
			doubleArray[i] = input.nextDouble();
			i++;
		}//即使我输入了11个input, while循环也使他只读取前10个
		input.close();
		System.out.println("The average of the array is: " + average(doubleArray));
	}
	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
	
	public static double average(double[]array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
}
