package basic.java;

public class ContinueAndBreak {

	public static void main(String[] args) {
	
		
		int i;
		for(i=0;i<=4;i++) { 
			if (i==3)
				continue;  // this skips 3 and then continues with the rest.
			System.out.println(i);
		}
		
		System.out.println("*********");
		int j;
		for(j=0;j<5;j++) {
			if(j==2) {
				break;  //this break the loop and print only 0,1
				
			}
			System.out.println(j);
		}
	}

}
