package basic.java;
import java.util.Scanner;

public class CharSearchOnString {
	
	String str;
	int x;
	char ch =0;
	 
	public void search() {
		for (int i = 0; i<str.length();i++) {
			 ch = str.charAt(x);
		}
		
		System.out.println(ch);	
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		CharSearchOnString obj = new CharSearchOnString();
		String string = scan.next();
		obj.str = string;
		System.out.println("enter the character at you wanna find in the string");
		int y = scan.nextInt();
		obj.x = y;
		obj.search();
		scan.close();
			
	}
}
