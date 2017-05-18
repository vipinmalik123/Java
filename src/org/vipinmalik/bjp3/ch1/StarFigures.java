package org.vipinmalik.bjp3.ch1;

public class StarFigures {
	public static void main (String[] args) {
		printStarFigure();
		System.out.println();
		printStarFigure();
		printParallelStarLines();
		System.out.println();
		print1StarLine();
		print1StarLine();
		print1StarLine();
		printStarFigure();
	}

	public static void print5StarLine () {
		System.out.println("*****");
	}

	public static void print2StarLine () {
		System.out.println(" * * ");
	}

	public static void print1StarLine () {
		System.out.println("  *  ");
	}

	public static void printParallelStarLines () {
		print5StarLine();
		print5StarLine();
	}

	public static void printStarCross () {
		print2StarLine();
		print1StarLine();
		print2StarLine();
	}

	public static void printStarFigure () {
		printParallelStarLines();
		printStarCross();
	}
}