package com.ava.Generics;

import java.util.ArrayList;
//Ye Cong 1306248
public class Autoboxing<E>  {
	
	public static int sumEven(ArrayList<Integer> li) {
		int sum = 0;
		for (Integer i : li) {
			if(i % 2 == 0) {
				sum += 1;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(3);
        num.add(6);
        num.add(9);
        num.add(12);
		System.out.println("The sum of even number is:" + Autoboxing.<Integer>sumEven(num));
	}

}
