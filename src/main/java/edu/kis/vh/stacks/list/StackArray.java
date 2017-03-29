package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {

	private static final int EMPTY_STACK_INDICATOR = -1;

	private static final int MAX_ITEMS = 12;

	private int[] items = new int[MAX_ITEMS];

	private int total = EMPTY_STACK_INDICATOR;

	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	@Override
	public boolean isFull() {
		return total == 11;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return items[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return items[total--];
	}

}
