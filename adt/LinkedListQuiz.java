package com.ava.adt;
//Ye Cong 1306248
public class LinkedListQuiz {

	public static void main(String[] args) {
		MyLinkedList<Integer> list1 = new MyLinkedList<>();
		list1.addNode(5);
		list1.addNode(-8);
		list1.addNode(2);
		list1.addNode(1);
		list1.addNode(8);
		list1.addNode(6);
		
		list1.addNode(5);
		System.out.println("Original list:");
        list1.display();

        list1.addFirst(80);

        System.out.println("Updated list after adding 80 at the beginning:");
        list1.display();
		
	}

}
