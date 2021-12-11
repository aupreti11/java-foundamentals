package OOPSConcept;

public class ClassAndObjectMain {

	public static void main(String[] args) {
		
		ClassAndObject obj = new ClassAndObject();		// creating an object of the class ClassAndObject
		ClassAndObject obj1 = new ClassAndObject();		// creating an object of the class ClassAndObject,  we can create multiple object of the same class.
		obj.run();
		obj.info();
		obj1.color ="black";							// changing the value of the color
		obj.info();
		System.out.println("==============");
		obj1.info();

	}

}
