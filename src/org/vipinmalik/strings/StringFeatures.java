package org.vipinmalik.strings;

public class StringFeatures {
	public static void main (String[] args) {
		// creating strings with new
		String s = new String("Hello");
		
		// format function for output formatting
		System.out.format(s + " %s %d", "World", 10);
		System.out.println();
		
		String s1 = "  Lorem ipsum dolor sit amet,   ";
		
		int s1Len = s1.length();
		
		System.out.println("Length : " + s1Len);
		
		//s1.charAt(arg0);
		System.out.println("CharAt index 1 : " + s1.charAt(1));
		
		//s1.compareTo(arg0);
		System.out.println("compareTo : " + s1.compareTo("lorem"));
		
		//s1.compareToIgnoreCase(arg0);
		
		//s1.concat(arg0);
		
		//s1.contains(arg0);
		
		//s1.contentEquals(arg0);
		
		//s1.endsWith(arg0);
		
		//s1.equals(arg0);
		
		//s1.equalsIgnoreCase(arg0);
		
		//s1.getBytes();
		
		//s1.getChars(arg0, arg1, arg2, arg3);
		
		//s1.getClass();
		
		//s1.indexOf(arg0);
		
		//s1.intern();
		
		//s1.isEmpty();
		
		//s1.lastIndexOf(arg0);
		
		//s1.matches(arg0);
		
		//s1.replace(arg0, arg1);
		
		//s1.replaceAll(arg0, arg1);
		
		//s1.split(arg0, arg1);
		
		//s1.substring(arg0);
		
		//s1.substring(arg0, arg1);
		
		//s1.toCharArray();
		
		//s1.toLowerCase();
		
		//s1.toUpperCase();
		
		//s1.trim();
	}
}
