package basic.java;

public class StringsDemo {
	
	public static void main(String[] args) {
		
		String str = "eisenhower";
		String str1 = "washingtongeorge";
		String str2 = "roosevelt";
		
		System.out.println(str + str1);  // string concatenation
		
		// CONVERT STRING TO UPPERCASE AND LOWERCASE
		
		String s = str.toUpperCase();
		System.out.println(s);
		String s1 = str1.toLowerCase();
		System.out.println(s1);
		
		String s2 = str2.toUpperCase();
		String s3 = s2.toLowerCase();
		System.out.println(s3);
		
		System.out.println(s3.toUpperCase());  // same as above method
		
		// FIND THE LENGTH OF A STRING
		
		int s4 = str.length();
		System.out.println(s4);
		System.out.println(str1.length());
		
		// charAt method
		
		char c =str.charAt(5);
		System.out.println(c);
		System.out.println(str1.charAt(9));
		
		// charAt method.
		String string = "agile and scrum";
		char ch = 0;
		for(int x=0; x<string.length();x++) {
			ch = string.charAt(7);
			
		}
		System.out.println("char = " +ch);
		
		//SUBSTRING METHOD
		
		String string1 = "amrit upreti";
		String substring = string1.substring(6);
		System.out.println(substring);
		
		// SPLIT METHOD
		
		String string2 = "java amrit anand tara";
		String splitstring[] = string2.split(" ");
		for(String t : splitstring) {
			System.out.println(t);
		}
		
		
		String strt =" I live in newyork city";
		String substrt[] = strt.split(" ");
		for(String p : substrt) {
			System.out.println(p);
		}
		
		// INDEX OF METHOD
		
		String start = "java spring hibernate corejava";
		int len = start.indexOf("java");
		System.out.println(len);
	}
}
