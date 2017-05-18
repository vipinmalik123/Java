package org.vipinmalik.bjp4.ch5;

import java.util.Scanner;

public class RobustInput {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type your age: ");
		while (!sc.hasNextInt()) {
			System.out.print("Type your age: ");
			sc.next();
		}
		int age = sc.nextInt();
		System.out.println("Type your GPA: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Type your GPA: ");
			sc.next();
		}
		Double gpa = sc.nextDouble();
		System.out.println("age = " + age + ", GPA = " + gpa);
		sc.close();
	}
}
