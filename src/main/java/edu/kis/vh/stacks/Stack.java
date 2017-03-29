package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * @author Maciej Kacprzak
 *
 */
public class Stack {

	private StackList stackList;

	public Stack() {
		this.stackList = new StackList();
	}
	
	public Stack(StackList stackList) {
		this.stackList = stackList;
	}

	public int getTotal() {
		return stackList.total();
	}

	public void push(int i) {
		stackList.pushElement(i);
	}

	public boolean isEmpty() {
		return stackList.empty();
	}

	public boolean isFull() {
		return stackList.full();
	}

	public int top() {
		return stackList.peek();
	}

	public int pop() {
		return stackList.pop();
	}
	

}
