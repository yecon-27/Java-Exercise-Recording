package com.ava.Generics;
//Ye Cong 1306248
public class GenericMethod {
	public static <T> boolean isEqual (GenericType<T> a, GenericType<T> b) {
		return a.get().equals(b.get());
	}
	public static void main(String[] args) {
		GenericType<String> a = new GenericType<>();
		a.set("Kean");
		GenericType<String> b = new GenericType<>();
		b.set("Ken");
		boolean isEqual = GenericMethod.<String>isEqual(a, b);
		System.out.println(isEqual);
		//Type inference: allow you to call a generic method as an ordinary method
		//Without specifying a type between angle brackets
		//Compiler will infer the type
		System.out.println(isEqual = GenericMethod.isEqual(a,  b));
	}
}
