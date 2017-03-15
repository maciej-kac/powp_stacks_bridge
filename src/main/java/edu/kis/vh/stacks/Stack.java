package edu.kis.vh.stacks;

/**
 * @author Maciej Kacprzak
 *
 */
public class Stack {

	private static final int EMPTY_STACK_INDICATOR = -1;

	private static final int MAX_ITEMS = 12;

	private int[] items = new int[MAX_ITEMS];

	private int total = EMPTY_STACK_INDICATOR;

	/**
	 * @return 
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param i - integer number to be pushed
	 */
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	/**
	 * @return true when stack is empty and false when isn't empty
	 */
	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	/**
	 * @return true when stack is full and false when isn't full
	 */
	public boolean isFull() {
		return total == 11;
	}

	/**
	 * @return number from top of the stack
	 */
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return items[total];
	}

	/**
	 * @return number from top of the stack and remove it from stack
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return items[total--];
	}

}
