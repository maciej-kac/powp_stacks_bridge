package edu.kis.vh.stacks;

public class Stack {

	private static final int EMPTY_STACK_INDICATOR = -1;

	private static final int MAX_ITEMS = 12;

	private int[] items = new int[MAX_ITEMS];

	private int total = EMPTY_STACK_INDICATOR;

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return items[total--];
	}

}
