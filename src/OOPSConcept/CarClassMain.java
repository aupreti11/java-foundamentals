package OOPSConcept;

public class CarClassMain {

	public static void main(String[] args) {
		
		CarClass obj = new CarClass();
		CarClass obj1 = new CarClass();
		
		obj.drive();
		obj1.info();
		obj1.ac = false;
		obj1.horn = false;
		System.out.println("=========");
		obj1.info();
		

	}

}
