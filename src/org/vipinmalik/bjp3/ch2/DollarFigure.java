package org.vipinmalik.bjp3.ch2;

public class DollarFigure {
	public static void main (String[] args) {
		for (int i = 0; i < 7; i++) {

			int j = 1;

			for (j = 1; j <= 2*i; j++){
				System.out.print("*");
			}

			for (j = 1; j <= 7-i; j++){
				System.out.print("$");
			}

			for (j = 1; j <= 14-2*i; j++){
				System.out.print("*");
			}

			for (j = 1; j <= 7-i; j++){
				System.out.print("$");
			}

			for (j = 1; j <= 2*i; j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}