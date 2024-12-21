package com.ava.adt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteration_HashSet {

	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>();
		mySet.add("London");
		mySet.add("Lagos");
		mySet.add("Kiev");
		mySet.add("New York");
		mySet.add("Beijing");
//		mySet.add("Paris");
//		mySet.add("Java");
		String[] str = {"London","Lagos","Kiev","New York","Beijing"};
		hashing(str);
		Iterator<String> iter = mySet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		}
	public static void hashing(String [] s) {
		for(String s1:s) {
			long s2 = s1.hashCode();
			System.out.println(s2);}
		
	}
	
	}


