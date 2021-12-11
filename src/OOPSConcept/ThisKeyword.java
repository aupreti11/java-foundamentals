package OOPSConcept;

public class ThisKeyword {
	
	int p = 10;
	
	public void keyword() {
		
		int p=20;
		System.out.println("this is the local variable p" + " "+p);
		System.out.println("this is the instance variable p" + " "+this.p);
	}
}
