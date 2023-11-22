package core;


public class Stack implements IStack {
	private int size = 5;
	private int[] stack = new int[size];
	private int count = 0;
	
	@Override
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int getSize() {
		return size;
	}
	
	@Override
	public boolean isFull() {
		if(count < size) {
			return false;
		}
		return true;
	}
	
	@Override
	public void pushStack(int value) {
		if(!isFull()) {
			count++;
			stack[count] = value;
		}
	}
	
	@Override
	public int getValue() {
		int value = stack[count];
		count--;
		return value;
	}
	
	@Override
	public int isTop() {
		return stack[count];
	}
	
	

}
