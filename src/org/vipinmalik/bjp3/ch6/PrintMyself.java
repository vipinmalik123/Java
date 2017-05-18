package org.vipinmalik.bjp3.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintMyself {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("N:/Projects/Java/src/org/vipinmalik/bjp3/ch6/PrintMyself.java"));
		while (input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		input.close();
	}

}
