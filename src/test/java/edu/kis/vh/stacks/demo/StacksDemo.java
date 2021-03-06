package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

// Poprawiłem wcięcia metod w klasie "stack"
// Wiersze: 14-32
// Poprawiłem wcięcie linijki pod if'em w klasie "stack"
// Wiersz: 11

// Poprawiłem wcięcia linijek pod while'em w klasie "StackFIFO"
// Wiersze: 10, 15

// Poprawiłem wcięcie linijek w klasie "StackHanoi"
// Wiersze: 5,10,12-15

// Kombinacja Alt + -> i Alt + <- umożliwa nawigację po miejscach w plikach, w których ostatnio byłem

// Zasadę izolacji łamią wszystkie klasy fabryk, ponieważ tworzone stosy zależą od tego jaką implementację stosu wybierzemy. 

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory defaultFactory = new DefaultStacksFactory();
		ArrayStacksFactory arrayFactory = new ArrayStacksFactory();
		ListStacksFactory listFactory = new ListStacksFactory();

		testStacks(defaultFactory);
		testStacks(arrayFactory);
		testStacks(listFactory);

	}

	private static void testStacks(IStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(),
				factory.getFIFOStack(), factory.getHanoiStack()};

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random randomNumber = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(randomNumber.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((StackHanoi) stacks[3]).getTotalRejected());
	}

}