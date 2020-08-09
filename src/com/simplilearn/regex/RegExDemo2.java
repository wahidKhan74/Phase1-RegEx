package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExDemo2 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches(".m", "2m")); // first char can be any value but 2nd char should be m
		System.out.println(Pattern.matches(".m", "2mm")); // false -> length more than 2 char
		System.out.println(Pattern.matches(".x", "mk")); // first char can be any value but 2nd char should be x
		System.out.println(Pattern.matches("..x", "mkx")); // first and 2nd char can be any value but 3rd char should be x
		System.out.println(Pattern.matches("x..", "xkm")); // first and 2nd char can be any value but 3rd char should be x
		System.out.println(Pattern.matches("x.", "xT")); // first should be x then 2nd char can be any value
		System.out.println(Pattern.matches(".n.", "NnT")); // n should be in middle

	}

}
