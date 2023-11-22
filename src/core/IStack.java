package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	void pushStack(int value);
	int isTop();
	boolean isFull();
	int getValue();
}
