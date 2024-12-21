package com.ava.adt;

public class HashTableTest {
	
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>(10);
        hashTable.put("Alice", 25);
        hashTable.put("Bob", 30);
        hashTable.put("Charlie", 35);

        System.out.println("Alice's age: " + hashTable.get("Alice"));
        System.out.println("Bob's age: " + hashTable.get("Bob"));
        System.out.println("Charlie's age: " + hashTable.get("Charlie"));

        hashTable.remove("Bob");
        System.out.println("Bob's age after removal: " + hashTable.get("Bob"));

        System.out.println("HashTable size: " + hashTable.size());
    }
}
