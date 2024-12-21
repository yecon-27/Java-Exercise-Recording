package com.ava.Generics;

public class BoxingandUnboxing {

	public static void main(String[] args) {
		int x = 5;
		//boxing
		Integer intBoxing = (Integer)x;
		System.out.println("After boxing: " + intBoxing);
		//auto-boxing with wrapper class: replaced by generic
		Integer intWrapperObject = new Integer(x);
		System.out.println("Integer wrapper object: " + intWrapperObject);
		//
		Integer intWrapperStringObject = new Integer("56");
		System.out.println("Integer wrapper object object: " + intWrapperStringObject);
		//auto casting
		System.out.println("Integer wrapper object object: " + intWrapperStringObject + 6);
		//the figure can be 62
		//System.out.println("Integer wrapper object object: " + (intWrapperStringObject + 6));

	}

}
