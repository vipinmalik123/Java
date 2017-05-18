package org.vipinmalik.bjp4.ch5;

import java.util.regex.Pattern;

public class IsVowel {
	public static void main (String[] args) {
		System.out.println(isVowel("a"));
		System.out.println(isVowel("A"));
		System.out.println(isVowel("c"));
		
		System.out.println(startEndSame("racecar"));
		System.out.println(startEndSame("hello"));
	}
	
	public static boolean isVowel (String character) {
		boolean isVowel = false;
		
		/*
		Pattern p = Pattern.compile("(?i)[aeiou]");
		
		if (p.matcher(character).find()) {
			isVowel = true;
		}
		*/
		
		if (character.matches("(?i)[aeiou]")) {
			isVowel = true;
		}
		
		return isVowel;
	}
	
	public static boolean startEndSame (String str) {
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return true;
		}
		return false;
	}
}
