package edu.kis.vh.stacks;

public interface IStack {

	public int EMPTY_STACK_INDICATOR = 0;
	public int MAX_ITEMS = 12;

	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	//Oczywiście realizacja zadania 10 pomogła mi w zmianie wartości stałej zwracanej gdy stos jest pusty.
	//Wykonanie zadanie wymagało ode mnie zmiany wartości tylko w jednym miejscu, a nie w sześciu.
}