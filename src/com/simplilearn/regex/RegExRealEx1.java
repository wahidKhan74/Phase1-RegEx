package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExRealEx1 {

	public static void main(String[] args) {
		
		// WA pattern for that accepts alphanumeric characters only.
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "WahidKhan074"));
		// WA pattern  for that accepts alphanumeric characters  but only of length 10
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{10}", "Wahkm09abc"));
		// WA pattern for firstName where only small alphabets allowed up to 6 char
		String firstName = "john";
		System.out.println(Pattern.matches("[a-z]{0,6}", firstName));
		// WA pattern for email where only small alphabets with number allowed up to 15 char
		
		String email = "johnsmithgm31";
		System.out.println(Pattern.matches("[a-z0-9]+{0,15}+", email));
		// WA pattern for email where only small alphabets with number and @ special allowed up to 15 char
		String email2 = "johnsmith31@gmail.com";
		System.out.println(Pattern.matches("[a-z0-9]+(.+)@(.+)", email2));
	}

}

//Ex :  firstName and lastName
// Ex : verify entered is valid or 