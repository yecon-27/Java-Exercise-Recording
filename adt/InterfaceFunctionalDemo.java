package com.ava.adt;
//Ye Cong 1306248
public class InterfaceFunctionalDemo {

	public static void main(String[] args) {
		//create an instance of the functional interface
		
		InterfaceFunctional fi = (a, b) -> System.out.println("The sum of a + b: " + (a + b));
		//instance access method in functional interface
		fi.add(3.5, 0.1);

	}

}
