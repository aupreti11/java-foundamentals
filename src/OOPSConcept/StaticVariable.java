package OOPSConcept;

public class StaticVariable {
	
	String name = "amrit";
	static String color ="blue";
	
	public void mobile() {
		
		System.out.println(name);
		System.out.println(color);
	}
	
	public static void main(String args[]) {
		// System.out.println(name); // this gives the error and we cannot access name since it is not static
		System.out.println(color);   // we can access the static variable  
	}

}
