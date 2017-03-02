package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	private Stack stack = new Stack();

	@Override
	public int pop() {
		while (!isEmpty())
			stack.push(super.pop());

		int result = stack.pop();

		while (!stack.isEmpty())
			push(stack.pop());

		return result;
	}
}
