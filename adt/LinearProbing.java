package com.ava.adt;
import java.util.LinkedList;

public class LinearProbing {

	public static void main(String[] args) {
		HashTable<Integer, String> ht = new HashTable<>(11);
		ht.put(34, "Ava");
		ht.put(29, "Ken");
		ht.put(53, "Tiffany");
		ht.put(44, "Belel");
		ht.put(120, "Pinata");
		ht.put(39, "Baha");
		ht.put(45, "Sangeet");
		ht.put(40, "Rana");
		System.out.println("Original HashTable:");
        ht.printHashTable();

        HashTable<Integer, String> ht1 = new HashTable<>(11);
        for (int i = 0; i < 11; i++) {
           LinkedList<HashTable.Entry<Integer, String>> bucket = ht.buckets[i];
            for (HashTable.Entry<Integer, String> entry : bucket) {
                int newIndex = linearProbing(entry.getKey(), ht1, 11);
                ht1.put(newIndex, entry.getValue());
            }
        }
        System.out.println("New HashTable with Linear Probing:");
        ht1.printHashTable();
    
	}

	public static <K,V> int linearProbing(int key,HashTable<K,V> ht, int arrayLength) {
		int i = 0;
		int index = (key + i) % arrayLength;
		while (!ht.buckets[index].isEmpty()) {
		    i++;
		    index = (key + i) % arrayLength;
		}
		return index;
}


}


