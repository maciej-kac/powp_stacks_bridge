package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	private final Stack stack = new Stack();

	public StackFIFO() {
		super();
	}

	public StackFIFO(IStack stack) {
		super(stack);
	}

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
