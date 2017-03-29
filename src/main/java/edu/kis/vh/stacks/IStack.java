package edu.kis.vh.stacks;

public interface IStack {

	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}