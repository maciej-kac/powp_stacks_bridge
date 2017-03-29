package edu.kis.vh.stacks;

public interface IStack {

	public int EMPTY_STACK_INDICATOR = -1;
	public int MAX_ITEMS = 12;

	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}