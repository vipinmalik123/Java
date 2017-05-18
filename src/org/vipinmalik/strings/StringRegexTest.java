package org.vipinmalik.strings;

import java.util.Arrays;

public class StringRegexTest {
	public static String knights =
			"Then, when you have found the shrubbery, you must " +
			"cut down the mightiest tree in the forest... " +
			"with... a herring!";

	public static void main (String[] args) {
		// Using regex with String matches
		System.out.println(knights.matches("[A-Z][^!]*!$"));
		
		// split
		System.out.println(Arrays.toString(knights.split("the|you")));
		
		// replaceAll
		System.out.println(knights.replaceAll("[aeiouAEIOU]", "_"));
	}
}
