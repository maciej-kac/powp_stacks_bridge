package edu.kis.vh.stacks.list;

public class Node {

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

	public void setValue(int value) {
		this.value = value;
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
