package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExDemo3 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[xyz]", "abc"));  // false // it is not a or b or c
		System.out.println(Pattern.matches("[xyz]", "x"));    // true // x is within x y and z
		System.out.println(Pattern.matches("[xyz]", "xyz"));  // false only match 
		System.out.println(Pattern.matches("[xyz]", "xxyyzzz"));  // false only match x or y or z.
		
		System.out.println(Pattern.matches("[xyz]?", "x"));  // true ( once a match)
		System.out.println(Pattern.matches("[xyz]?", "xxx"));  // false (x more than once)
		System.out.println(Pattern.matches("[xyz]?", "y"));  // false (x more than once)
		
		System.out.println(Pattern.matches("[xyz]+", "y"));  // true (y is once)
		System.out.println(Pattern.matches("[xyz]+", "yy"));  // true (y is more than once)
		System.out.println(Pattern.matches("[xyz]+", "mkn"));  // false (no match)
		
		System.out.println(Pattern.matches("[a-z]+", "mkn"));  // true ( match)
		System.out.println(Pattern.matches("[A-Z]+", "PKQ"));  // true ( match)
		System.out.println(Pattern.matches("[a-zA-Z]+", "mknPKQ"));  // true ( match)
		System.out.println(Pattern.matches("[0-9]", "9"));  // true ( match)
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "Wahidkhan74"));  // true ( match)
		System.out.println("------------------");
		System.out.println(Pattern.matches("\\d", "mkn"));  // false ( not digit match)
		System.out.println(Pattern.matches("\\d", "7"));  // true ( 0-9 match)
		System.out.println(Pattern.matches("\\D", "P"));  // true ( not digit match)
		System.out.println(Pattern.matches("\\D", "pder"));  // false ( not digit but more than one char )
		
	}

}
