package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
		String data  = "nn";
		// pattern
		Pattern pat = Pattern.compile(".m");
		
		// matcher
		Matcher mat = pat.matcher(data);
		
		boolean res = mat.matches();
		System.out.println("String macthes 1 "+res);
		
		boolean res2  = Pattern.compile(".m").matcher("xm").matches();
		System.out.println("String macthes 2 "+res2);
		
		boolean res3 = Pattern.matches(".m", "ym");
		System.out.println("String macthes 3 "+res3);
	}

}
