package week12;
//Ye Cong 1306248
public class MyStackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY =5;
	
	//Construct a stack with the default capacity 5
	public MyStackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}
	
	//Construct a stack with the specified maximum capacity
	public MyStackOfIntegers (int capacity) {
		elements = new int[capacity];
	}
	
	//Push elements into the top of stack and could throw exception
	public void push (int value) throws MyFullStackException{
		//Base condition: probably cause an error/ probably not to run/ initialize the setting
		if (getSize() == elements.length) 
			throw new MyFullStackException("Stack is full.");
		
		else
			elements[size++] = value;
	}
	//push -- pop
	//Return and remove the top element from the stack
	public int pop() {
		return elements[--size];
	}
	
	public int peek() {
		return elements[size - 1];
		}
	//Test whether the stack is empty
	public boolean empty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
}
