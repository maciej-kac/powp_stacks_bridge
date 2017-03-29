package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

public class StackFIFO extends Stack {

	private final Stack stack = new Stack(new StackList());

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
	
	//Użyłem w tej klasie stosu opartego na StackList, ponieważ jest on bardziej optymalny.
}
