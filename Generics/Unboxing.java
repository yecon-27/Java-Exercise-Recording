package com.ava.Generics;
import java.util.ArrayList;
import java.util.List;
public class Unboxing {
//Ye Cong 1306248
	public static void main(String[] args) {
		Integer i = new Integer(-8);
		//1.Unboxing through method invocation
		int absVal = absoluteValue(i);
		System.out.println("absolute value of " + i + " = " + absVal);
		List<Double> ld = new ArrayList<>();
		ld.add(3.1316);
		//2.Unboxing through assignment
		double pi = ld.get(0);
		System.out.println("pi = " + pi);
	}
	public static int absoluteValue(int i) {
		return (i < 0) ? -1 : i;
	}
}
