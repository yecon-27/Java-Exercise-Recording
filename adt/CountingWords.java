package com.ava.adt;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class CountingWords {

	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();
		String sentence = "The lazy dog jumped over the lazy cat when the cat wanted to jump";
		String[] words = sentence.toLowerCase().split(" ");
		for(String word:words) {
			if(hmap.containsKey(word)) {
				hmap.put(word, hmap.get(word) + 1);
			}else {
				hmap.put(word, 1);
			}
		}
		Set<String> set = hmap.keySet();
		for(String word : set) {
			if(hmap.get(word)>=1) {
				System.out.println(word + "\t:" + hmap.get(word));
			}
		}
		 

	}

}
