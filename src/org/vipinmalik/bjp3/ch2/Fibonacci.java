package org.vipinmalik.bjp3.ch2;

public class Fibonacci {
	public static void main (String[] args) {
		int f_1 = 0;
		int f_2 = 1;

		for (int count = 0; count < 12; count++) {
			System.out.print(f_2 + " ");
			f_2 = f_2 + f_1;
			f_1 = f_2 - f_1;
		}
		
	}
}

