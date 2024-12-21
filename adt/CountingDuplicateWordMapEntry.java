package com.ava.adt;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class CountingDuplicateWordMapEntry {

	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();
		String sentence = "The lazy dog jumped over the lazy cat when the lazy cat wanted to jump";
		//1.split sentence into word
		String[] words = sentence.toLowerCase().split(" ");
		//2.count word occurrence using the map.put()
		for(String word : words) {
			if(hmap.containsKey(word)) {
				hmap.put(word, hmap.get(word) + 1);
			}else {
				hmap.put(word, 1);
			}
		}
		//what new
		Set<Map.Entry<String, Integer>> keyset = hmap.entrySet();
		System.out.println("Map.Entry<K,V>: ");
		for(Map.Entry<String, Integer> me : keyset) {
			System.out.println(me.getKey()+ " \t:" + me.getValue());
		}
 
	}

}
