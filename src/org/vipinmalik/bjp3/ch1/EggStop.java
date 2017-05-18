package org.vipinmalik.bjp3.ch1;

public class EggStop {
	public static void main (String[] args) {
		printfigure1();
		printBlankLine();
		printfigure2();
		printBlankLine();
		printfigure3();
	}

	public static void printfigure1 () {
		printEggTop();
		printEggBottom();
	}

	public static void printfigure2 () {
		printfigure1();
		printDashLine();
	}

	public static void printfigure3 () {
		printEggTop();
		printStopLine();
		printEggBottom();
		printDashLine();
	}

	public static void printEggTop () {
		System.out.println("  ______   ");
		System.out.println(" /      \\ ");
		System.out.println("/        \\");
	}

	public static void printEggBottom () {
		System.out.println("\\        /");
		System.out.println(" \\______/ ");
	}

	public static void printDashLine () {
		System.out.println("+--------+");
	}

	public static void printStopLine () {
		System.out.println("|  STOP  |");
	}

	public static void printBlankLine () {
		System.out.println();
	}
}