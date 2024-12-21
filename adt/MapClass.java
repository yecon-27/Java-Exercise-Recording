package com.ava.adt;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class MapClass {
//Ye Cong 1306248
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Jane");
		map.put(4, "Jane");
		map.put(3, "Eve");
		map.put(2, "John");
		System.out.println("Initial map: " + map);
		System.out.println("Output from lambda expression:");
		map.forEach((k, v) -> System.out.println(k + ", " + v + " "));
		System.out.println("keySet: " + map.keySet());
		System.out.println("Values: " + map.values());
		System.out.println("Contains key 5: " + map.containsKey(5));
		
		System.out.println("Output from Map.Entry<K, V>:");
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> e = itr.next();
			System.out.println("" + e.getKey() + "," + e.getValue());
		}

	}

}
