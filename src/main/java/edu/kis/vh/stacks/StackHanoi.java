package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private static final int MIN_TOTAL_REJECTED = 0;
	private int totalRejected = MIN_TOTAL_REJECTED;

	public StackHanoi() {
		super();
	}

	public StackHanoi(IStack stack) {
		super(stack);
	}

	public int getTotalRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
