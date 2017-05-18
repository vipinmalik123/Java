package org.vipinmalik.bjp3.ch3;

import java.util.Scanner;

public class CollegeAdmit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("University admission program");
		System.out.print("What is your GPA? ");
		Double gpa = sc.nextDouble();
		System.out.print("What is your SAT score? ");
		int sat = sc.nextInt();
		sc.close();

		if (gpa >= 1.8 && sat >= 900) {
			System.out.println("You were accepted!");
		} else if (gpa < 1.8) {
			System.out.println("Your GPA is too low.");
		} else {
			System.out.println("Your SAT score is too low.");
		}
	}
}