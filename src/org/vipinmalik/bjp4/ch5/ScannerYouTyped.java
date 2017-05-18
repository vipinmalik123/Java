package org.vipinmalik.bjp4.ch5;

import java.util.Scanner;

public class ScannerYouTyped {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		
		if (sc.hasNextInt()) {
			System.out.println("You typed the integer " + sc.nextInt());
		} else {
			System.out.println("You typed the real number " + sc.nextDouble());
		}
		sc.close();
	}

}
