package org.vipinmalik.bjp3.ch2;

public class PrintDesign {
	public static void main (String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int k = 1; k <= (11-i)/2; k++) {
				System.out.print("-");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(i + "");
			}

			for (int k = 1; k <= (11-i)/2; k++) {
				System.out.print("-");
			}
			
			System.out.println();
			i++;
		}
	}
}