package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * @author Maciej Kacprzak
 *
 */
public class Stack {

	private IStack stack;

	public Stack() {
		this.stack = new StackList();
	}
	
	public Stack(IStack stack) {
		this.stack = stack;
	}

	public int getTotal() {
		return stack.getTotal();
	}

	public void push(int i) {
		stack.push(i);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int top() {
		return stack.top();
	}

	public int pop() {
		return stack.pop();
	}
	
	//Konsekwencją zmiany typu atrybutu na interfejs jest 
	//możliwość przechowywania w nim obiektów różnych klas (które implementują ten interfejs "IStack") 
}
