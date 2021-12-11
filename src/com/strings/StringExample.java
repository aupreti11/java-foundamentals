package com.strings;

public class StringExample {

	public static void main(String[] args) {
	
		String name = "amrit";
		String name1 = "amrit";
		String name2 = new String("amrit");
		System.out.println(name==name1);
		System.out.println(name==name2);
		char c[] = {'a','m','r','i','t'};
		String name3 = new String(c);
		System.out.println(name==name3);
		
		System.out.println(name.toUpperCase());
		System.out.println(name1.toLowerCase());
		
		System.out.println(name.equals(name1));  // true
		System.out.println(name.equals(name2));  // true
		System.out.println(name1.equals(name3)); // true
		
		String myname = "amr";
		String yourname = "amri";
		System.out.println(name.compareTo(myname));  //compareTo gives the length difference of strings
		System.out.println(name.compareTo(yourname));
		System.out.println(name.compareTo(name1));
		
		// string concatenation
		
		System.out.println(20+30+name+60+2);
		
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf("t"));
		
		String s = "hi my name is amrit upreti";
		System.out.println(s);
		System.out.println(s.replaceAll("[aeiou]", " "));
		System.out.println(s.replace("i", "p"));
		
		System.out.println(s.substring(2, 8));
		System.out.println(s.substring(5));
		
		// reverse the string
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		
		
	
	}
}