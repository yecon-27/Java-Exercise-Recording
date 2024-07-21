package week12;
//Ye Cong 1306248
public class MyStackOfIntegers1 {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY =5;
	
	//Construct a stack with the default capacity 5
	public MyStackOfIntegers1() {
		this (DEFAULT_CAPACITY);
	}
	//Construct a stack with the specified maximum capacity
	public MyStackOfIntegers1 (int capacity) {
		elements = new int[capacity];
	}
	//Push elements into the top of stack and could throw exception
	public void push (int value) throws MyFullStackException{
		if (getSize() == elements.length)
			throw new MyFullStackException("The stack is full.");
		else
			elements[size++] = value;
	}
	//Return and remove the top element from the stack
	public int pop(int value) throws MyStackEmptyException{
		if (empty()) {
            throw new MyStackEmptyException("Stack is empty.");
        }
        // 保存栈顶元素的值
        value = elements[--size];
        // 可选：将刚弹出的元素位置设为null或一个默认值，以避免LOL（悬空指针/垃圾收集问题）
        return value;
	}
	public int peek(int value) throws MyStackEmptyException{
		if(empty())
			throw new MyStackEmptyException();
		
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


