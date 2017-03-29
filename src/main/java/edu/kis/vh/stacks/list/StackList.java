package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack {

	private Node last;
	private int total;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		total++;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}
	
	@Override
	public int getTotal() {
		if (isEmpty())
			return -1;
		return total;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		total--;
		return ret;
	}

	//Jedyną użyteczną opcją Eclipse IDE było Refactor>Rename
}

class Node {

	private int value;
	private Node prev;
	private Node next;
	// Po hermetyzacji nieprywatnych pól,
	// dostęp do nich w klasie StackList został zastąpiony metodami typu "getter"		
	// a w miejscach, w których te atrybuty są modyfikowane używane są metody typu "setter"

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
