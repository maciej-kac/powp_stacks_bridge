package edu.kis.vh.stacks.types;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {

	private int[] items = new int[IStack.MAX_ITEMS];

	private int total = IStack.EMPTY_STACK_INDICATOR;

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
		return total == IStack.EMPTY_STACK_INDICATOR;
	}

	@Override
	public boolean isFull() {
		return total == IStack.MAX_ITEMS;
	}

	@Override
	public int top() {
		if (isEmpty())
			return IStack.EMPTY_STACK_INDICATOR;
		return items[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return IStack.EMPTY_STACK_INDICATOR;
		return items[total--];
	}

}
