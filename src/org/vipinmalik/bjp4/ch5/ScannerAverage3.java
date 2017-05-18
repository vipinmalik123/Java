package org.vipinmalik.bjp4.ch5;

import java.util.Random;
import java.util.Scanner;

public class ScannerAverage3 {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.print(r.nextInt(3));
		System.out.print(r.nextInt(3));
		System.out.print(r.nextInt(3));
		System.out.print(r.nextInt(3));
		System.out.print(r.nextInt(3));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type an integer: ");
		while (!sc.hasNextInt()) {
			System.out.print("Type an integer: ");
			sc.next();
		}
		
		int num1 = sc.nextInt();
		
		System.out.print("Type an integer: ");
		while (!sc.hasNextInt()) {
			System.out.print("Type an integer: ");
			sc.next();
		}
		
		int num2 = sc.nextInt();
		
		System.out.print("Type an integer: ");
		while (!sc.hasNextInt()) {
			System.out.print("Type an integer: ");
			sc.next();
		}
		
		int num3 = sc.nextInt();
		
		Double average = ((double)num1+num2+num3)/3;
		
		System.out.println("Average: " + average);
		
		sc.close();

	}

}
