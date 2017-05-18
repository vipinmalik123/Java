package org.vipinmalik.bjp3.ch3;

import java.util.Scanner;

class PromptMultiplyBy2 {
	public static void main(String[] args) {
		System.out.print("Type an integer: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num + " times 2 = " + (num*2));
		sc.close();
	}
}