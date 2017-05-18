package org.vipinmalik.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static String knights =
			"Then, when you have found the shrubbery, you must " +
			"cut down the mightiest tree in the forest... " +
			"with... a herring!";

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^aeiou]");

		Matcher m = p.matcher(knights);
		
		while(m.find()) {
			System.out.print(m.group() + " ");
		}
	}

}
