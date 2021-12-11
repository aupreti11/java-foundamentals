package OOPSConcept;

public class ClassAndObject {  // this is the class and the name of the class is ClassAndObject
	
	//  class is user defined blue print or prototype from which objects are created.
	// it is a group of similar object { class fruits ( Object mango, banana etc)}
	// it contains the descriptions of the objects.
	
	
	// object are the real entity which can be identify as per its attribute and behavior.
	// it is an instance of the class.
	
	
	int age =2;					// these are the attribute of the class
	
	int leg = 4;
	String color="white";

	public void run() {				// methods, are the behaviour of the class.
		System.out.println("this is run method");
	}
	public void info() {			// methods, are the behaviour of the class.
		System.out.println("this is info method");
		System.out.println("age is " + age);
		System.out.println("leg is " + leg);
		System.out.println("color is " + color);
	}

}
