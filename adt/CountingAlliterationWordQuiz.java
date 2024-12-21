package com.ava.adt;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class CountingAlliterationWordQuiz {

	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alliteration sentence, i will count the occurence for you:)");
		String sentence= sc.nextLine();
		String[] words = sentence.toLowerCase().split("[\\s+\\p{P}]");
		for(String word:words) {
			if(hmap.containsKey(word)) {
				hmap.put(word, hmap.get(word) + 1);
			}else {
				hmap.put(word, 1);
			}
		}
		System.out.println(hmap.entrySet());
		sc.close();
	}
 
}
