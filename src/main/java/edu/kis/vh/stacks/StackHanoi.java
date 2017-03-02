package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private static final int MIN_TOTAL_REJECTED = 0;
	int totalRejected = MIN_TOTAL_REJECTED;

	public int getTotalRejected() {
		return totalRejected;
	}

	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
