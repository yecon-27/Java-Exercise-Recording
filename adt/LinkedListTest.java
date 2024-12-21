package com.ava.adt;

public class LinkedListTest {

	public static void main(String[] args) {
		MyLinkedList<String> List1 = new MyLinkedList<>();
		List1.addNode("Ken");
		List1.addNode("Kean");
		List1.addNode("Bob");
		List1.addNode("Lisa");
		List1.addNode("Ava");
		List1.display();

	}

}
