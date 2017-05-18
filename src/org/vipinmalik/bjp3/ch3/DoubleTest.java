package org.vipinmalik.bjp3.ch3;

class DoubleTest {
	public static void main(String[] args) {
		System.out.println((0.2+1.2+2.2+3.2));
		System.out.println(String.format("%.1f", (0.2+1.2+2.2+3.2)));

		double gpa = 3.2;
		double credits = gpa*3;

		System.out.println(Float.parseFloat(String.format("%.1f", credits)));
		if (Float.parseFloat(String.format("%.1f", credits)) == (float) 9.6) {
			System.out.println("You earned enough credits.");
		}

		printChars('e','g');
		printChars('z','a');
		printChars('q','r');

		String str = "vipin";
		System.out.println(Character.isUpperCase(str.toCharArray()[0]));

		lastFirst("Vipin Malik");
	}

	public static void printChars(char start, char end) {
		for (char letter = start; letter<=end; letter++) {
			System.out.print(letter);
		}
		System.out.println();
	}

	public static void lastFirst (String name) {
	    System.out.println(name.split(" ")[1] + ", " + name.split(" ")[0].charAt(0) + ".");
	}
}