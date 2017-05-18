package org.vipinmalik.bjp3.ch2;

public class NumbersOutput {
	public static final int NUMBER_OF_REPITITIONS = 6;
	public static final int NUMBER_RANGE = 10;

	public static void main (String[] args) {
		int val = 0;

		for (int i = 1; i <= NUMBER_OF_REPITITIONS; i++) {
			for (int j = 1; j <= NUMBER_RANGE; j++) {
				val = j % NUMBER_RANGE;
				if (val == 0) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
		}

		System.out.println();

		for (int i = 1; i <= NUMBER_OF_REPITITIONS; i++) {
			for (int j = 1; j <= NUMBER_RANGE; j++) {
				val = j % NUMBER_RANGE;
				System.out.print(val + "");
			}
		}
	}
}