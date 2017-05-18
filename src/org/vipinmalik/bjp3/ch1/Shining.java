package org.vipinmalik.bjp3.ch1;

public class Shining {
	public static void main (String[] args) {
		print1000Lines();
	}

	public static void printLine () {
		System.out.println("All work and no play makes Jack a dull boy.");
	}

	public static void print2Lines () {
		printLine();
		printLine();
	}

	public static void print5Lines () {
		print2Lines();
		print2Lines();
		printLine();
	}

	public static void print10Lines () {
		print5Lines();
		print5Lines();
	}

	public static void print100Lines () {
		print10Lines();
		print10Lines();
		print10Lines();
		print10Lines();
		print10Lines();
		print10Lines();
		print10Lines();
		print10Lines();
		print10Lines();
		print10Lines();
	}

	public static void print1000Lines () {
		print100Lines();
		print100Lines();
		print100Lines();
		print100Lines();
		print100Lines();
		print100Lines();
		print100Lines();
		print100Lines();
		print100Lines();
		print100Lines();
	}
}