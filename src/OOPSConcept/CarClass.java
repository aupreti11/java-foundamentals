package OOPSConcept;

public class CarClass {
	
	int wheel = 4;
	int driver =1;
	boolean horn = true;
	boolean ac = true;
	
	public void drive() {
		
		System.out.println("car can be drive");
	}
	
	public void info() {
		System.out.println("wheel " + " = " + wheel);
		System.out.println("driver " + " = " + driver);
		System.out.println("horn " + " = " + horn);
		System.out.println("ac " + " = " + ac);
	}

}
