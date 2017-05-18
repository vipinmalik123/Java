package org.vipinmalik.bjp3.ch1;

public class TwoRockets {
	public static void main (String[] args) {
		int numberOfRockets = 2;
		printNozzle(numberOfRockets);
		printHorizontalBorder(numberOfRockets);
		printVerticalBorder(numberOfRockets);
		printVerticalBorder(numberOfRockets);
		printHorizontalBorder(numberOfRockets);
		printCountryName(numberOfRockets);
		printHorizontalBorder(numberOfRockets);
		printVerticalBorder(numberOfRockets);
		printVerticalBorder(numberOfRockets);
		printHorizontalBorder(numberOfRockets);
		printNozzle(numberOfRockets);
	}

	public static void printNozzle (int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("   /\\   ");
			System.out.print(" ");
		}
		System.out.println();

		for (int i = 0; i < count; i++) {
			System.out.print("  /  \\  ");
			System.out.print(" ");
		}
		System.out.println();
		
		for (int i = 0; i < count; i++) {
			System.out.print(" /    \\ ");
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void printHorizontalBorder (int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("+------+");
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void printVerticalBorder (int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("|      |");
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void printCountryName (int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("|United|");
			System.out.print(" ");
		}
		System.out.println();
		
		for (int i = 0; i < count; i++) {
			System.out.print("|States|");
			System.out.print(" ");
		}
		System.out.println();
	}
}