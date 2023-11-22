package core;


public class Stack implements IStack {
	private int size;
	
	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}
	
	@Override
	public boolean isFull() {
		return false;
	}
	
	@Override
	public void pushStack(int value) {
		size++;
	}
	
	@Override
	public int getValue() {
		int temp = size;
		size--;
		return temp;
	}
	
	@Override
	public int isTop() {
		return getSize();
	}
	
	

}
