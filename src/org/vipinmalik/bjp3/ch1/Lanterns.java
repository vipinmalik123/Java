package org.vipinmalik.bjp3.ch1;

public class Lanterns {
	public static void main (String[] args) {
		printFigure1();
		printBlankLine();
		printFigure2();
		printBlankLine();
		printFigure3();
	}

	public static void printFigure1() {
		print5StarLine();
		print9StarLine();
		print13StarLine();
	}

	public static void printFigure2() {
		printFigure1();
		printMiddleLine();
		print13StarLine();
		printFigure1();
	}

	public static void printFigure3() {
		printFigure1();
		print5StarLine();
		printMiddleLine();
		printMiddleLine();
		print5StarLine();
		print5StarLine();
	}

	public static void print5StarLine () {
		System.out.println("    *****    ");
	}

	public static void print9StarLine () {
		System.out.println("  *********  ");
	}

	public static void print13StarLine () {
		System.out.println("*************");
	}

	public static void printMiddleLine () {
		System.out.println("* | | | | | *");
	}

	public static void printBlankLine () {
		System.out.println();
	}

}