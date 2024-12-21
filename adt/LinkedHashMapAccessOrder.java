package com.ava.adt;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapAccessOrder {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new LinkedHashMap<Integer, String>(16, .75f, true);
		map.put(1, "ken");
		map.put(2, "eva");
		map.put(3, "bob");
		map.put(4, "lisa");
		System.out.println("Intersection order: ");
		for(String value:map.values()) {
			System.out.println(value);
	}
		String val = map.get(3);
		System.out.println("key 3 is:" + val);
		map.put(2, "jane");
		map.get(1);
		System.out.println("Access order after changes: ");
		for(String value:map.values()) {
			System.out.println(value);}

}
}

