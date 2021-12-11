package basic.java;

import java.util.Scanner;

public class SwitchCase {
	
	// use to select one of many code blocks to be executed.
	// it is an alternative to if else if ladder.
	// the value of expression is compared with the value of each case, if match, the associated block of code is executed.
	// default keyword specifies some code to run if there is no case match.
	

	public static void main(String[] args) {
	

		Scanner scan = new Scanner(System.in);
		System.out.println("enter  the day ");
		int day = scan.nextInt();
		scan.close();
		switch(day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("you entered the wrong day");
			break;
			
		}	
	}
}

