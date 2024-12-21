package com.ava.recursion;

public class CharDefaultTest {
	char c;
	//Ye Cong 1306248
	public static void main(String[] args) throws Exception{
		CharDefaultTest t = new CharDefaultTest();
		
		char c1 = '\u0000';
		
		System.out.println(t.c);//. means a call--> a connection
		System.out.println(c1);
		System.out.println(t.c == c1);
		System.out.println(0 == c1);/*'\u0000' equivalent to 0*/
		System.out.println(t);//dereferencing解引用: memory address--reference variable获取指针或引用所指的值或对象的过程
		System.out.println(t.toString());
	}

}
